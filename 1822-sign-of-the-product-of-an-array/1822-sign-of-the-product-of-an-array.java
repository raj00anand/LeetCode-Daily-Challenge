class Solution {
    public int arraySign(int[] nums) {
        double product=1;
        for(int val: nums){
            product *= val;
        }
        System.out.println(product);
        return signFunc(product);
        
    }
    public int signFunc(double val){
        if(val<0){
            return -1;
        }else if(val > 0){
            return 1;
        }else{
            return 0;
        }
    }
}