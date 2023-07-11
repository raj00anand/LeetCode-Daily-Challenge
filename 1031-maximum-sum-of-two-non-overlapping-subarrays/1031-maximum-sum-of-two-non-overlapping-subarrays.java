class Solution {
    int n;
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        n=nums.length;
        int prefix[]=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        
        return Math.max(maxSum(prefix, firstLen, secondLen), maxSum(prefix, secondLen, firstLen));
    }
    public int maxSum(int prefix[], int L, int M){
        int ans = 0, maxL = 0;
        for(int i=L+M; i<n+1;i++){
            maxL = Math.max(maxL, prefix[i-M]-prefix[i-M-L]);
            ans = Math.max(ans, maxL + prefix[i]-prefix[i-M]);
        }
        return ans;
    }
}