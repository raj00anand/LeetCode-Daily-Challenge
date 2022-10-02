class Solution {
    int mod=(int)1e9+7;
    public int numRollsToTarget(int n, int k, int target) {
        Integer dp[][]=new Integer[n+1][target+1];
        return solve(n, k, target, dp);
    }
    public int solve(int n, int k, int target, Integer dp[][]){
        if(n==0 || target<0){
            return target==0 ? 1:0;
        }
        if(dp[n][target]!=null) return dp[n][target];
        int ways=0;
        for(int i=1;i<=k;i++){
            ways = (ways+solve(n-1, k, target-i, dp))%mod;
        }
        return dp[n][target]=ways;
        
    }
}