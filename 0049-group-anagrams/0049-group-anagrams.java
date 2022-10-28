class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<HashMap<Character, Integer>, List<String>> map=new HashMap<>();
        for(String str: strs){
            HashMap<Character, Integer> shm=new HashMap<>();
            for(char ch: str.toCharArray()){
                shm.put(ch, shm.getOrDefault(ch,0)+1);
            }
            if(map.containsKey(shm)==false){
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(shm, list);
            }else{
                List<String> list=map.get(shm);
                list.add(str);
            }
        }
        for(List<String> val: map.values()){
            ans.add(val);
        }
        return ans;
        
    }
}