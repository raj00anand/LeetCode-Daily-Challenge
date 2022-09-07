class Solution {
    public int compress(char[] chars) {
        String s=chars[0]+"";
        int count=1;
        for(int i=1;i<chars.length;i++){
            char pre=chars[i-1];
            char curr=chars[i];
            if(pre==curr){
                count++;
            }else{
                if(count>1){
                    s+=String.valueOf(count);
                    count=1;
                }
                s+=curr;
            }
        }
        if(count>1){
            s+=String.valueOf(count);
            count=1;
        }
        
        for(int i = 0; i<chars.length && i<s.length(); i++){
            chars[i] = s.charAt(i);
        }
        
        
        return s.length();
    }
}