class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int val: nums){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        int n=0, rep=0;
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    rep=i;
                }
            }else{
                n=i;
            }
        }
        return new int[]{rep, n};
        
    }
}