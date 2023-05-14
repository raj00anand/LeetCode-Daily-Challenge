class Solution {
    public int maxScore(int[] nums) {
        int dp[]=new int[1<<14];
        Arrays.fill(dp, -1);
        int m=nums.length, n=nums.length/2;
        int gcd[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                gcd[i][j]=gcd(nums[i], nums[j]);
            }
        }
        return solve(nums, 1, 0, dp, gcd);
        
    }
    public int solve(int nums[], int ops, int mask, int dp[], int gcd[][]){
        int m=nums.length, n=(nums.length/2);
        if(ops>n) return 0;
        
        if(dp[mask]!=-1) return dp[mask];
        for(int i=0;i<m;i++){
            if((mask & (1<<i)) !=0) continue;
            for(int j=i+1;j<m;j++){
                if((mask & (1<<j))!=0) continue;
                
                int newMask = (1<<i) | (1<<j) | mask;
                int res = ops * gcd[i][j] +solve(nums, ops+1, newMask, dp, gcd);
                
                dp[mask]=Math.max(dp[mask], res);
            }
        }
        return dp[mask];
    }
    public int gcd(int x, int y){
        if(y==0) return x;
        
        return gcd(y, x%y);
    }
}