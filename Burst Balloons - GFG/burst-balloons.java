//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int maxCoins(int N, int[] arr) {
    // code here
    int dp[][]=new int[N][N];
    return maxCoin(arr, 0, N-1, dp);

  }
  public static int maxCoin(int arr[], int start, int end, int dp[][]){
      if(start>end){
          return 0;
      }
      if(dp[start][end]!=0){
          return dp[start][end];
      }
      int max=arr[start];
      for(int i=start;i<=end;i++){
          int val=maxCoin(arr, start, i-1, dp)+get(arr, i)*get(arr, start-1)*get(arr, end+1)+maxCoin(arr, i+1, end, dp);
          max=Math.max(val, max);
      }
      dp[start][end]=max;
      return max;
  }
  public static int get(int arr[], int i){
      if(i==-1 || i==arr.length){
          return 1;
      }
      return arr[i];
  }
}
     