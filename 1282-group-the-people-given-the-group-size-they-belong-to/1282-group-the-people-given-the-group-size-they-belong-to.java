class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<groupSizes.length;i++){
            int val = groupSizes[i];
            if(map.containsKey(val)){
                List<Integer> list = map.get(val);
                list.add(i);
                map.put(val, list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(val, list);
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key).size()>key){
                int size = map.get(key).size();
                for(int i=0;i<size-key+1;i+=key){
                    List<Integer> temp = map.get(key).subList(i, i+key);
                    ans.add(temp);
                }
                
            }else{
                ans.add(map.get(key));
            }
            
        }
        
        return ans;
    }
}