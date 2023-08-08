class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        String ans = "";
        int i=0, j=0;
        while(i<m && j<n){
            ans += word1.charAt(i++);
            ans += word2.charAt(j++);
        }
        if(i<m){
            ans += word1.substring(i, m);
        }
        if(j<n){
            ans += word2.substring(j, n);
        }
        return ans;
    }
}