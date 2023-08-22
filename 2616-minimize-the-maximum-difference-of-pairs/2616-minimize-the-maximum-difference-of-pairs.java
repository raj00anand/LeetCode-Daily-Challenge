class Solution {
    public int minimizeMax(int[] nums, int p) {
        int n= nums.length;
        Arrays.sort(nums);
        int left = 0, right = nums[n-1] - nums[0];
        while(left<right){
            int mid = left + (right-left)/2;
            
            if(validPairs(nums, mid) >= p){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    
    public int validPairs(int[] nums, int p){
        int count = 0;
        int i=0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i] <= p){
                count++;
                i++;
            }
            i++;
        }
        return count;
    }
}