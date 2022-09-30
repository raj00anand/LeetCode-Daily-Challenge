class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> list=new ArrayList<>();
        for(int a[]: buildings){
            list.add(new int[]{a[0],-a[2]});
            list.add(new int[]{a[1],a[2]});
        }
        Collections.sort(list,(a,b)->{
            if(a[0]==b[0]) return (a[1]-b[1]);
            return a[0]-b[0];
        });
        
        List<List<Integer>> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] t=list.get(0);
        pq.add(-t[1]);
        int ct=-t[1];
        List<Integer> l=new ArrayList<>();
        l.add(t[0]);
        l.add(-t[1]);
        ans.add(l);
        for(int i=1;i<list.size();i++){
            t=list.get(i);
            if(t[1]<0){
                pq.add(-t[1]);
            }else{
                pq.remove(t[1]);
            }
            
            if(!pq.isEmpty() && pq.peek()!=ct){
                l=new ArrayList<>();
                l.add(t[0]);
                l.add(pq.peek());
                ans.add(l);
                ct=pq.peek();
            }else if(pq.isEmpty()){
                l=new ArrayList<>();
                l.add(t[0]);
                l.add(0);
                ans.add(l);
                ct=0;
            }
        }
        return ans;
        
    }
}