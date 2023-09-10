class Solution {
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;  
    }
    public int removeElement(int[] nums, int val) {
        int i=0, j=0;
        
        while(i<nums.length){
            if(nums[i] != val){
                swap(nums, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j;
    }
}