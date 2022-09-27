class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        return solve(s1, s2,n, m , dp);
    }
    public int solve(String s1, String s2, int n, int m, int dp[][]){
        if(n==0){
            return dp[n][m]=getSum(s2,m);
            
        }
        if(m==0){
            return dp[n][m]= getSum(s1, n);
        }
        if(dp[n][m]!=0){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]= solve(s1, s2, n-1, m-1,dp);
        }else{
            int ans1=s1.charAt(n-1)+solve(s1, s2, n-1, m,dp);
            int ans2=s2.charAt(m-1)+solve(s1, s2, n, m-1, dp);
            
            return dp[n][m]= Math.min(ans1, ans2);
        }
        
    }
    public int getSum(String s, int n){
        int ans=0;
        for(int i=0;i<n;i++){
            ans += s.charAt(i);
        }
        return ans;
    }
}