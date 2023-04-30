class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a,b)->(b[0]-a[0]));
        UnionFind UF_alice=new UnionFind(n+1);
        UnionFind UF_bob=new UnionFind(n+1);
        
        int removed_edges=0, alice_edges=0, bob_edges=0;
        for(int[] edge: edges){
            if(edge[0]==3){
                if(UF_alice.union(edge[1], edge[2])){
                    UF_bob.union(edge[1], edge[2]);
                    alice_edges++;
                    bob_edges++;
                }else{
                    removed_edges++;
                }
            }else if(edge[0]==2){
                if(UF_bob.union(edge[1], edge[2])){
                    bob_edges++;
                }else{
                    removed_edges++;
                }
            }else{
                if(UF_alice.union(edge[1], edge[2])){
                    alice_edges++;
                }else{
                    removed_edges++;
                }
            }
        }
        return (alice_edges == n-1 && bob_edges==n-1) ? removed_edges : -1;
    }
}
class UnionFind{
    int parent[];
    int rank[];
    
    public UnionFind(int n){
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }
    public int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    public boolean union(int x, int y){
        int px=find(x), py=find(y);
        if(px!=py){
            if(rank[px]<rank[py]){
                parent[px]=py;
            }else if(rank[px]>rank[py]){
                parent[py]=px;
            }else{
                parent[px]=py;
                rank[py]++;
            }
            return true;
        }
        return false;
    }
}