class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val: stones){
            pq.add(val);
        }
        while(pq.size()>1){
            int x=pq.remove();
            int y=pq.remove();
            if(x!=y){
                int temp=Math.abs(x-y);
                pq.add(temp);
            }
        }
        if(pq.size()==0) return 0;
        return pq.remove();
        
    }
}