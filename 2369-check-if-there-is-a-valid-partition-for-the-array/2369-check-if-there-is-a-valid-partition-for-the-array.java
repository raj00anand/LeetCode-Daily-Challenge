class Solution {
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        boolean dp[]=new boolean[n+1];
        dp[0]=true;
        
        for(int i=0;i<nums.length;i++){
            int idx = i+1;
            if(i>0 && nums[i-1]==nums[i]){
                dp[idx] |= dp[idx-2];
            }
            if(i>1 && nums[i-2]==nums[i] && nums[i-1]==nums[i]){
                dp[idx] |= dp[idx-3];
            }
            if(i>1  && nums[i]-nums[i-2]==2 && nums[i]-nums[i-1]==1){
                dp[idx] |= dp[idx-3];
            }
        }
        return dp[n];
        
    }
}