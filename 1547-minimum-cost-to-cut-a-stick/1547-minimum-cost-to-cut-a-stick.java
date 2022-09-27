class Solution {
    int len=0;
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        len=n;
        int l=cuts.length;
        int dp[][]=new int[l+1][l+1];
        
        return solve(n, 0, cuts.length, cuts, dp);
    }
    public int solve(int n, int st, int end, int[] cuts, int dp[][]){
        
        if(st>=end){
            return 0;
        }
        if(dp[st][end]!=0){
            return dp[st][end];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=st;i<end;i++){
            int li=st==0 ? 0: cuts[st-1];
            int ri=end==cuts.length? len : cuts[end];
            
            int cost=ri-li;
            int left=solve(n, st, i, cuts,dp);
            int right=solve(n, i+1, end, cuts, dp);
            
            int myans=left+right+cost;
            ans=Math.min(myans, ans);
        }
        dp[st][end]=ans;
        return ans;
    }
}