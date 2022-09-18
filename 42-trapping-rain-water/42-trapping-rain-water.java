class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxl[]=new int[n];
        maxl[0]=height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>=maxl[i-1]){
                maxl[i]=height[i];
            }else{
                maxl[i]=maxl[i-1];
            }
        }
        int maxr[]=new int [n];
        maxr[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]>=maxr[i+1]){
                maxr[i]=height[i];
            }else{
                maxr[i]=maxr[i+1];
            }
        }
        int max[]=new int[n];
        for(int i=0;i<max.length;i++){
            max[i]=Math.min(maxl[i],maxr[i])-height[i];
        }
        int ans=0;
        for(int i=0;i<max.length;i++){
            ans+=max[i];
        }
        return ans;
    }
}