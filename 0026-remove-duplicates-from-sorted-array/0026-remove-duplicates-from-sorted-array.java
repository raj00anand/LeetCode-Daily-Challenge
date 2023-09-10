class Solution {
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int pre = nums[0];
        int i=1, j=1;
        while(i<nums.length){
            if(pre != nums[i]){
                swap(nums, i, j);
                pre = nums[j];
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j;
    }
}