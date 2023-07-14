class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int res = 1;
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            if(map.containsKey(val-difference)){
                map.put(val, map.get(val-difference)+1);
            }else{
                map.put(val, 1);
            }
            res = Math.max(res, map.get(val));
        }
        return res;
        
    }
}