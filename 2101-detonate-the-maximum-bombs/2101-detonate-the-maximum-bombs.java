class Solution {
    public void dfs(int i, int c[], boolean visited[], List<List<Integer>> graph){
        c[0]++;
        visited[i]=true;
        for(int nbr: graph.get(i)){
            if(!visited[nbr]){
                dfs(nbr, c, visited, graph);
            }
        }
    }
    public int maximumDetonation(int[][] bombs) {
        int n=bombs.length;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                if(i!=j){
                    long x1 = bombs[i][0];
                    long y1 = bombs[i][1];
                    long r1 = bombs[i][2];
                    long x = bombs[j][0];
                    long y = bombs[j][1];
                    
                    long dis = (x-x1)*(x-x1) + (y-y1)*(y-y1);
                    if(dis <= r1*r1){
                        graph.get(i).add(j);
                    }
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int c[]=new int[1];
            boolean visited[]=new boolean[n];
            dfs(i, c, visited, graph);
            ans = Math.max(c[0], ans);
        }
        return ans;
    }
}