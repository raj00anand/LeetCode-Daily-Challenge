class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long totalPower = 0;
        
        for(int val: batteries){
            totalPower += val;
        }
        
        long left =0, right = totalPower/n;
        
        while(left<right){
            long target = right - (right - left) / 2;
            long extra = 0;
            
            for(int power: batteries){
                extra += Math.min(power, target);
            }
            
            if(extra >= (long)(n*target)){
                left = target;
            }else{
                right = target -1;
            }
        }
        return left;
    }
}