class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map=new TreeMap<>();
        for(String str: words){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        List<String> ans=new ArrayList<>(map.keySet());
        Collections.sort(ans, (a,b)->map.get(b)-map.get(a));
        return ans.subList(0, k);
    }
}