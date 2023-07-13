class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        
        int left = 0, k=res.length-1;
        int right = nums.length-1;
        while(left <= right){
            int lv = nums[left]*nums[left];
            int rv = nums[right]*nums[right];
            
            if(lv <= rv){
                res[k--] = rv;
                right--;
            }else{
                res[k--] = lv;
                left++;
            }
        }
        return res;
    }
}