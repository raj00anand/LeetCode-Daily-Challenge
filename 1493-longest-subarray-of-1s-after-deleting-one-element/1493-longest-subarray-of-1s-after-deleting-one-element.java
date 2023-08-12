class Solution {
    public int longestSubarray(int[] nums) {
        int n= nums.length;
        int ans = Integer.MIN_VALUE;
        int left = 0, right = 0;
        boolean zero = false;
        while(right<n){
            if(nums[right]==1){
                right++;
            }else if(nums[right]==0 && !zero){
                zero = true;
                right++;
            }else{
                while(zero){
                    if(nums[left]==0){
                        zero = false;
                    }
                    left++;
                }
            }
            // int tempAns = zero ? ;
            ans = Math.max(ans, right - left -1);
        }
        return ans;
    }
}