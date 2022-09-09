class Solution {
    public int strStr(String haystack, String needle) {
        int msl=haystack.length();
        int tsl=needle.length();
        
        for(int i=0;i<msl-tsl+1;i++){
            String hst=haystack.substring(i,i+tsl);
            
            if(hst.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}