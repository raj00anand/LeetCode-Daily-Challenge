class Solution {
    public boolean stoneGame(int[] piles) {
        int total=0;
        for(int val: piles){
            total += val;
        }
        int dp[][]=new int[piles.length+1][piles.length];
        for(int arr[]: dp){
            Arrays.fill(arr, -1);
        }
        //System.out.println(solve(piles, 0, piles.length-1));
        return (total-solve(piles, 0, piles.length-1, dp))>0;
        
    }
    public int solve(int piles[], int i, int j, int dp[][]){
        int sum=0;
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int sum1=piles[i]+Math.max(solve(piles, i+2,j, dp), solve(piles, i+1, j-1, dp));
        int sum2=piles[j]+Math.max(solve(piles, i, j-2, dp), solve(piles, i+1, j-1, dp));
        sum=Math.max(sum1, sum2);
        dp[i][j]=sum;
        return sum;
    }
}