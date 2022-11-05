//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==1){
                    if(dfs(grid, i, j, visited)){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return false;
        
    }
    public boolean dfs(int[][] grid, int i, int j, boolean visited[][]){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || visited[i][j]==true || grid[i][j]==0) return false;
        
        if(grid[i][j]==2){
            return true;
        }
        visited[i][j]=true;
        boolean up=dfs(grid, i-1, j, visited);
        if(up==true){
            return true;
        }
        boolean down=dfs(grid, i+1, j, visited);
        if(down==true){
            return true;
        }
        boolean left=dfs(grid, i, j-1, visited);
        if(left==true){
            return true;
        }
        boolean right=dfs(grid, i, j+1, visited);
        if(right==true){
            return true;
        }
        visited[i][j]=false;
        return up || down || left || right;
    }
}