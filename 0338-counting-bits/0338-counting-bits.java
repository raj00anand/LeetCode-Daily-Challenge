class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        
        for(int i=0;i<=n;i++){
            if(i==0 || i==1){
                dp[i]=i;
            }else{
                int count = 0;
                int temp = i;
                while(temp!=0){
                    int x = temp & 1;
                    // System.out.println(x);
                    if(x==1){
                        count++;
                    }
                    temp = temp >> 1;
                }
                dp[i]=count;
            }
            
        }
        return dp;
    }
}