class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> ((Math.abs(a-x)==Math.abs(b-x)) ? b-a: (Math.abs(b-x)-Math.abs(a-x))));
        for(int val: arr){
            pq.add(val);
            if(pq.size()>k){
                pq.remove();
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(pq.size()>0){
            ans.add(pq.remove());
        }
        Collections.sort(ans);
        return ans;
    }
}