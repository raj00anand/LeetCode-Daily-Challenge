class Solution {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1){
                    if(!map.containsKey(i+1)) map.put(i+1, new ArrayList<>());
                    map.get(i+1).add(j+1);
                }
            }
        }
        int ans=0;
        boolean visited[]=new boolean[isConnected.length+1];
        for(int key: map.keySet()){
            if(visited[key]==false){
                dfs(key, map, visited);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(int i, Map<Integer, List<Integer>> map, boolean visited[]){
        visited[i]=true;
        for(int nbr: map.get(i)){
            if(visited[nbr]==false){
                dfs(nbr, map, visited);
            }
        }
    }
}