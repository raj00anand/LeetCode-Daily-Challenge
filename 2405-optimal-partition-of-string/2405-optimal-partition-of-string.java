class Solution {
    public int partitionString(String s) {
        int res=1;
        Set<Character> set=new HashSet<>();
        for(char ch: s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                
            }else{
                res++;
                set.clear();
                set.add(ch);
                
            }
        }
        return res;
    }
}