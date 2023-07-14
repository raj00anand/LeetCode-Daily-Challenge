class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int count = 0;
        
        for(int val: nums){
            if(count == 0){
                majorityElement = val;
            }
            
            if(majorityElement == val){
                count++;
            }else{
                count--;
            }
        }
        return majorityElement;
    }
}