class Solution {
    public int[] runningSum(int[] nums) {
        int prefix[]=new int[nums.length];
        int sum=0, i=0;
        for(int val: nums){
            sum += val;
            prefix[i++]=sum;
        }
        return prefix;
    }
}