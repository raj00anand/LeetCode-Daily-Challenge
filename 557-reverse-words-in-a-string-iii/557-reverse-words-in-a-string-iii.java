class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String revStr=reverse(words[i]);
            res.append(revStr+" ");
            
        }
        return res.toString().trim();
    }
    public String reverse(String str){
        String nstr=new StringBuilder(str).reverse().toString();
        return nstr;
    }
}