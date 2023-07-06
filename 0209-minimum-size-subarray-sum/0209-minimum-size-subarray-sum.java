class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int temp=0;
        int sum = 0;
        
        
        int ans = Integer.MAX_VALUE;
        int start = 0;
        for(int i=0;i<nums.length;i++){
            temp += nums[i];
            while(temp >= target){
                
                ans = Math.min(ans, i - start +1);
                temp -= nums[start++];
            }
            
        }
        return ans==Integer.MAX_VALUE ? 0 : ans;
    }
}