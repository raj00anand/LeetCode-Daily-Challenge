class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0, 0);
    }
    public static int solve(int[] nums, int target, int sum, int i, int ans){
        if(i==nums.length){
            if(sum==target){
                ans++;
            }
            return ans;
        }
        
        
        int ansp = solve(nums, target, sum + nums[i], i+1, ans);
        int ansn = solve(nums, target, sum - nums[i], i+1, ans);
        
        return ansp+ansn;
    }
}