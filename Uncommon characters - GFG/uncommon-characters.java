//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        int freqA[]=new int[26];
        int freqB[]=new int[26];
        for(int i=0;i<A.length();i++){
            freqA[A.charAt(i)-'a']++;
        }
        for(int i=0;i<B.length();i++){
            freqB[B.charAt(i)-'a']++;
        }
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(freqB[ch-'a']==0 && !list.contains(ch)){
                list.add(ch);
            }
        }
        for(int i=0;i<B.length();i++){
            char ch=B.charAt(i);
            if(freqA[ch-'a']==0 && !list.contains(ch)){
                list.add(ch);
            }
        }
        //char ch[]=str.toCharArray();
        //Arrays.sort(ch);
        String ans="";
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            ans += list.get(i);
        }
        return ans.length()==0? "-1": ans;
    }
}