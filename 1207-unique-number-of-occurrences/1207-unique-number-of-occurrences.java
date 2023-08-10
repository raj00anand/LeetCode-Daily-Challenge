class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int val: arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        HashSet<Integer> res = new HashSet<>();
        for(int val: map.values()){
            if(res.contains(val)){
                return false;
            }
            res.add(val);
        }
        return true;
    }
}