class Solution {
    public int numberOfArrays(String s, int k) {
        int n=s.length();
        int dp[]=new int[n];
        Arrays.fill(dp, -1);
        return solve(s, k, 0, dp);
    }
    public int solve(String s, int k, int i, int dp[]){
        if(i==s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        
        if(dp[i]!=-1) return dp[i];
        
        int ans=0;
        long num=0;
        for(int j=i;j<s.length();j++){
            num = num*10+ s.charAt(j)-'0';
            if(num>k) break;
            ans = (ans+solve(s, k, j+1, dp))%1000000007;
            
        }
        return dp[i]=ans;
    }
}