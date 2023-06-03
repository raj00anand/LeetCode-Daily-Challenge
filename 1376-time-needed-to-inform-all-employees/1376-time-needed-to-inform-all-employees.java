class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<manager.length;i++){
            if(manager[i]!=-1){
                if(!map.containsKey(manager[i])) map.put(manager[i], new ArrayList<>());
                map.get(manager[i]).add(i);
            }
        }
        int ans=Integer.MIN_VALUE;
        Queue<Pair> que = new ArrayDeque<>();
        que.add(new Pair(headID, 0));
        while(!que.isEmpty()){
            Pair rp = que.remove();
            ans = Math.max(ans, rp.time);
            if(informTime[rp.node]!=0){
                List<Integer> list = map.get(rp.node);
                for(int i=0;i<list.size();i++){
                    que.add(new Pair(list.get(i),rp.time+informTime[rp.node]));
                }
            }
        }
        return ans;
    }
}
class Pair{
    int node;
    int time;
    
    Pair(int node, int time){
        this.node=node;
        this.time=time;
    }
}