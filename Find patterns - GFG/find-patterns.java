//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String S, String W){
        // code here
        char s[]=S.toCharArray();
        char w[]=W.toCharArray();
        int ans=0;
        for(int i=0;i<s.length;i++){
            int j=i;
            if(s[i]==w[0]){
                int k=0;
                while(j<s.length && k<w.length){
                    if(s[j]==w[k]){
                        s[j]='@';
                        k++;
                    }
                    j++;
                }
                if(k==w.length){
                    ans++;
                }
            }
        }
        return ans;
    }
}