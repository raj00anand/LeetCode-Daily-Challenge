class Solution {
    public int integerBreak(int n) {
        Integer dp[]=new Integer[n+1];
        return solve(n, 0, dp);
    }
    public int solve(int n, int sum, Integer dp[]){
        
        if(sum>n){
            return 0;
        }
        if(sum==n){
            return 1;
        }
        if(dp[sum]!=null){
            return dp[sum];
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int res=solve(n, sum+i, dp);
            max=Math.max(max, res*i);
        }
        return dp[sum]=max;
    }
}