class Solution {
    public int numSplits(String s) {
        HashSet<Character> set=new HashSet<>();
        //HashSet<Character> right=new HashSet<>();
        int suffix[]=new int[s.length()];
        int count=0;
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            suffix[i]=set.size();
        }
        set.clear();
        int prefix[]=new int[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            set.add(s.charAt(i));
            prefix[i]=set.size();
        }
        for(int i=0;i<suffix.length-1;i++){
            if(suffix[i]==prefix[i+1]){
                count++;
            }
        }
        
        return count;
        
    }
}