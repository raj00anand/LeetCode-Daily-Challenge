class Solution {
    public int largestAltitude(int[] gain) {
        int ans = Integer.MIN_VALUE;
        int res[]=new int[gain.length+1];
        res[0]=0;
        int sum = 0;
        for(int i=1;i<res.length;i++){
            sum += gain[i-1];
            res[i]=sum;
        }
        for(int i=0;i<res.length;i++){
            ans = Math.max(ans, res[i]);
        }
        return ans;
        
    }
}