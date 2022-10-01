class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long dp[][]=new long[n][2];
        for(long ans[]: dp){
            Arrays.fill(ans,-1);
        }
        return solve(0, nums, 0, dp);  
    }
    public long solve(int i, int[] nums, int p, long dp[][]){
        if(i>=nums.length) return 0;
        if(dp[i][p]!=-1){
            return dp[i][p];
        }
        long ans=0;
        long ele=(long)nums[i];
        if(p==0){
            ans=solve(i+1, nums, 1, dp)+ele;
        }else{
            ans= solve(i+1, nums, 0, dp)-ele;
        }
        ans=Math.max(ans, solve(i+1, nums, p, dp));
        dp[i][p]=ans;
        return ans;
    }
}