class Solution {
    public int pivotIndex(int[] nums) {
        int left[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left[i]=nums[i];
            }else{
                left[i] = left[i-1]+nums[i];
            }
        }
        
        int right[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                right[i]=nums[i];
            }else{
                right[i] = right[i+1]+nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}