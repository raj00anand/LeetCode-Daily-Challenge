class Solution {
    int n;
    public boolean wordBreak(String s, List<String> wordDict) {
        n = s.length();
        Boolean dp[]=new Boolean[n];
        HashSet<String> set = new HashSet<>(wordDict);
        return solve(0, s, set, dp);
        
    }
    public boolean solve(int idx, String s, HashSet<String> set, Boolean dp[]){
        if(idx == n){
            return true;
        }
        if(dp[idx] != null){
            return dp[idx];
        }
//         if (dp[idx] != null)
//             return dp[ind];
        
        for(int i=idx;i<n;i++){
            if(set.contains(s.substring(idx, i+1))){
                if(solve(i+1, s, set, dp)){
                    return dp[idx]=true;
                }
            }
        }
        return dp[idx]=false;
    }
}