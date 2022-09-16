class Solution {
    int n, m;
    Integer dp[][];
    public int maximumScore(int[] nums, int[] multipliers) {
        dp=new Integer[1001][1001];
        n=nums.length;
        m=multipliers.length;
        return solve(0, 0, nums, multipliers);
    }
    public int solve(int i, int j, int nums[], int mul[]){
        if(i==m){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int left=mul[i]*nums[j]+solve(i+1, j+1, nums, mul);
        int right=mul[i]*nums[(n-1)-(i-j)]+solve(i+1, j, nums, mul);
        return dp[i][j]=Math.max(left, right);
    }
}