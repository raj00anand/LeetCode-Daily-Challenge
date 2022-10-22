//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fillingBucket(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int mod=(int )1e8;
    static int fillingBucket(int N) {
        // code here
        int dp[]=new int[N+3];
        Arrays.fill(dp, -1);
        return solve(N, 0, dp);
    }
    static int solve(int N, int sum, int dp[]){
        int ans=0;
        if(sum>N){
            return 0;
        }
        if(sum==N){
            return 1;
        }
        if(dp[sum]!=-1){
            return dp[sum];
        }
        int one=solve(N, sum+1, dp);
        int two=solve(N, sum+2, dp);
        
        return dp[sum]=(one+two)%mod;
        
    }
};