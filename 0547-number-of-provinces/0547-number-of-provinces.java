class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean visited[]=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==false){
                dfs(isConnected, i, visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(int[][] isConnected, int i, boolean visited[]){
        
        
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && visited[j]==false){
                visited[j]=true;
                dfs(isConnected, j, visited);
            }
        }
    }
}