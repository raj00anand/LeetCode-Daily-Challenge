class Solution {
    public int concatenatedBinary(int n) {
        int mod=(int)1e9+7;
        long ans=0;
        //int count=0;
        for(int i=1;i<=n;i++){
            int count=0;
            int temp=i;
            while(temp>0){
                temp=temp/2;
                count++;
            }
            ans = ((ans<<count)+i)%mod;
        }
        return (int)ans;
    }
}