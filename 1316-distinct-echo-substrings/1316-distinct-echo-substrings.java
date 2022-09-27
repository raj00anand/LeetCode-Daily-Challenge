class Solution {
    public int distinctEchoSubstrings(String text) {
        int n=text.length();
        int count=0;
        HashSet<String> set=new HashSet<>();
        for(int len=1;len<=n/2;len++){
            for(int l=0, r=len; r<n; l++, r++){
                if(text.charAt(l)==text.charAt(r)){
                    count++;
                }else{
                    count=0;
                }
                if(count==len){
                    String str=text.substring(l,r);
                    set.add(str);
                    count--;
                }
            }
            
        }
        return set.size();
        
    }
}