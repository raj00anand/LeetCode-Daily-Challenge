class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int Currsum=0, preSum=0;
        for(int val: nums){
            Currsum += val;
            if(set.contains(Currsum%k)){
                return true;
            }
            Currsum %= k;
            set.add(preSum);
            preSum=Currsum;
        }
        return false;
        
    }
}