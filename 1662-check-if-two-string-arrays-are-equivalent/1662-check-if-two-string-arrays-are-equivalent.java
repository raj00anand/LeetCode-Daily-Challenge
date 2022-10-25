class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        for(String str: word1){
            str1 += str;
        }
        String str2="";
        for(String str: word2){
            str2 += str;
        }
        //System.out.println(str1);
        //System.out.println(str2);
        return str1.equals(str2);
    }
}