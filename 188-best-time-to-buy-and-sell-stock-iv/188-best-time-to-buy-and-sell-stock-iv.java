class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length==0 || prices.length==1){
            return 0;
        }
        int dp[][]=new int[k+1][prices.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=0;
                }else if(i==0){
                    dp[i][j]=0;
                }else if(j==0){
                    dp[i][j]=0;
                }else{
                    int max=dp[i][j-1];
                    for(int l=j-1;l>=0;l--){
                        max=Math.max(max, prices[j]-prices[l]+dp[i-1][l]);
                        
                    }
                    dp[i][j]=max;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}