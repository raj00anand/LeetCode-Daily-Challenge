class Solution {
    public int numSimilarGroups(String[] strs) {
        boolean vis[]=new boolean[strs.length];
        int res=0;
        for(int i=0;i<strs.length;i++){
            if(!vis[i]){
                res++;
                dfs(i, strs, vis);
            }
        }
        return res;
    }
    public void dfs(int i, String strs[], boolean vis[]){
        vis[i]=true;
        for(int j=0;j<strs.length;j++){
            if(vis[j]) continue;
            if(isSimilar(strs[i], strs[j])){
                dfs(j, strs, vis);
            }
        }
    }
    public boolean isSimilar(String str1, String str2){
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) count++;
        }
        return (count==2 || count==0);
    }
}