class Solution {
    public int longestOnes(int[] nums, int k) {
        int n= nums.length;
        int ans = Integer.MIN_VALUE;
        int left = 0, right = 0, tempCount = 0, countZero = 0;
        while(right<n){
            if(nums[right]==1){
                right++;
            }else if(nums[right]==0 && countZero<k){
                countZero++;
                right++;
            }else{
                while(countZero>=k){
                    if(nums[left]==0){
                        countZero--;
                    }
                    left++;
                }
            }
            ans = Math.max(ans, right-left);
        }
        return ans;
        
    }
}