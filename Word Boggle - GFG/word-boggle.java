//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            String[] dictionary = new String[N];
            for(int i=0;i<N;i++)
            {
                dictionary[i] = sc.next();
            }
            
            int R = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            
            char board[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    board[i][j] = sc.next().charAt(0);
                }
            }
            
            Solution obj = new Solution();
            String[] ans = obj.wordBoggle(board, dictionary);
            
            if(ans.length == 0) System.out.println("-1");
            else
            {
                Arrays.sort(ans);
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        // Write your code here
        Node root=new Node();
        for(String word: dictionary){
            insert(word, root);
        }
        ArrayList<String> list=new ArrayList<>();
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,root, i, j, list, visited);
            }
        }
        String ans[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
        
    }
    public class Node{
        Node childs[]=new Node[100];
        String str;
    }
    public void insert(String word, Node root){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.childs[ch-'A']==null){
                curr.childs[ch-'A']=new Node();
            }
            curr=curr.childs[ch-'A'];
        }
        curr.str=word;
    }
    public void dfs(char board[][], Node root, int i, int j, ArrayList<String> list, boolean visited[][]){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j]==true){
            return;
        }
        if(root.childs[board[i][j]-'A']==null) return;
        Node child=root.childs[board[i][j]-'A'];
        if(child.str!=null){
            list.add(child.str);
            child.str=null;
        }
        
        
        visited[i][j]=true;
        dfs(board,child, i+1, j, list, visited);
        dfs(board,child, i-1, j, list, visited);
        dfs(board,child, i, j-1, list, visited);
        dfs(board,child, i, j+1, list, visited);
        dfs(board, child, i-1, j-1, list, visited);
        dfs(board, child, i-1, j+1, list, visited);
        dfs(board, child, i+1, j-1, list, visited);
        dfs(board, child, i+1, j+1, list, visited);
        visited[i][j]=false;
    }
    
    
}