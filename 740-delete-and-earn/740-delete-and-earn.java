class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int dp[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            dp[val]++;
        }
        int inc=0,exc=0;
        for(int i=0;i<dp.length;i++){
            int ninc=exc+dp[i]*i;
            int nexc=Math.max(inc, exc);
            inc=ninc;
            exc=nexc;
        }
        return Math.max(inc, exc);
    }
}