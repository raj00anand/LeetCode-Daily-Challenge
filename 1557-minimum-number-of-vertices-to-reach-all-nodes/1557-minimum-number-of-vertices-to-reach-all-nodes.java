class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        boolean vis[]=new boolean[n];
        
        for(List<Integer> edge: edges){
            vis[edge.get(1)]=true;
        }
        
        for(int vertex=0;vertex<n;vertex++){
            if(!vis[vertex]){
                res.add(vertex);
            }
        }
        return res;
        
    }
}