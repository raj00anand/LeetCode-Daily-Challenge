class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        if(len==1){
            return 1;
        }
        if(s.charAt(0)!=s.charAt(len-1)){
            return len;
        }
        
        int left = 0, right = len-1;
        while(left<right && s.charAt(left)==s.charAt(right)){
            char ch = s.charAt(left);
            while(left<=right && s.charAt(left)==ch){
                left++;
            }
            while(left<=right && s.charAt(right)==ch){
                right--;
            }
        }
        return right-left+1;
    }
}