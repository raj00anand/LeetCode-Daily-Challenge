class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int total=0;
        for(int val: nums){
            total += val;
        }
        int p1=healper(nums, 0, nums.length-1);
        int p2=total-p1;
        return p1>=p2;
    }
    public int healper(int[] nums, int st, int end){
        if(st>end){
            return 0;
        }
        if(st==end){
            return nums[st];
        }
        
        int choice1=nums[st]+Math.min(healper(nums, st+2, end), healper(nums, st+1, end-1));
        int choice2=nums[end]+Math.min(healper(nums, st, end-2), healper(nums, st+1, end-1));
        
        return Math.max(choice1, choice2);
    }
}