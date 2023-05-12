class Solution {
    public long mostPoints(int[][] questions) {
        long dp[]=new long[questions.length+1];
        Arrays.fill(dp, -1);
        long res = solve(0, questions, dp);
        return res;
    }
    public long solve(int idx, int[][] questions, long dp[]){
        if(idx>=questions.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        long take_It=questions[idx][0]+(solve(idx+questions[idx][1]+1, questions, dp));
        long leave_It=solve(idx+1, questions, dp);
        dp[idx]=Math.max(take_It, leave_It);
        return dp[idx];
    }
}