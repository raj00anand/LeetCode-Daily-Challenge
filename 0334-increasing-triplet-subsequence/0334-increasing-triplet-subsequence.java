class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        for(int val: nums){
            if(val<=i){
                i=val;
            }else if(val<=j){
                j=val;
            }else{
                return true;
            }
        }
        return false;
        
    }
}