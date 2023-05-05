class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        int res=0, count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i<k){
                if(set.contains(ch)){
                    count++;
                }
            }else{
                if(set.contains(s.charAt(i-k))){
                    count--;
                }
                if(set.contains(ch)){
                    count++;
                }
            }
            res=Math.max(res, count);
            
        }
        return res;
    }
}