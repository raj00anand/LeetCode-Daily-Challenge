class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> mp = new TreeMap();
        for(String str: words){
            mp.put(str, mp.getOrDefault(str, 0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue( new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2){
                return e1.getValue() != e2.getValue()? e1.getValue() - e2.getValue():e2.getKey().compareTo(e1.getKey());
            }
        });
        for(Map.Entry<String,Integer> et:mp.entrySet()){
            pq.offer(et);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> res = new LinkedList();
        while(!pq.isEmpty()){
           res.add(0,pq.poll().getKey());
       }
        return res;
    }
}