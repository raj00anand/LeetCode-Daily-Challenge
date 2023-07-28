class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        
        return healper(nums, 0, n-1, n)>=0;
    }
    public int healper(int nums[], int left, int right, int n){
        if(left == right){
            return nums[left];
        }
        
        int leftMax = nums[left] - healper(nums, left+1, right, n);
        int rightMax = nums[right] - healper(nums, left, right-1, n);
        
        return Math.max(leftMax, rightMax);
    }
}