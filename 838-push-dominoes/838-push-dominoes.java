class Solution {
    public String pushDominoes(String dominoes) {
        char dp[]=dominoes.toCharArray();
        int n=dominoes.length(), right=-1;
        for(int i=0;i<n;i++){
            if(dp[i]=='L'){
                if(right==-1){
                    for(int j=i-1;j>=0 && dp[j]=='.';j--){
                        dp[j]='L';
                    }
                }else{
                    for(int j=right+1, k=i-1;j<k;j++,k--){
                        dp[j]='R';
                        dp[k]='L';
                    }
                    right=-1;
                }
            }else if(dp[i]=='R'){
                if(right!=-1){
                    for(int j=right+1;j<i;j++) dp[j]='R';
                }
                right=i;
            }
        }
        if(right!=-1){
            for(int j=right+1;j<n;j++) dp[j]='R';
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<dp.length;i++){
            sb.append(dp[i]);
        }
        return sb.toString();
    }
}