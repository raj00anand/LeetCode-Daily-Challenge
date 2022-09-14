class Solution {
    int mod= (int)1e9+7;
    int dp[][];
    public int numberOfWays(int startPos, int endPos, int k) {
        dp=new int[3001][k+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        
        return solve(startPos, endPos, k);
    }
    public int solve(int start, int end, int k){
        
        if(dp[start+1000][k]!=-1) return dp[start+1000][k];
        if(start==end && k==0){
            
            return 1;
        }
        if(k==0){
            return 0;
        }
        int left=solve(start+1, end, k-1)%mod;
        int right=solve(start-1, end, k-1)%mod;
        dp[start+1000][k]=(left+right)%mod;
        return (left+right)%mod;
    }
}