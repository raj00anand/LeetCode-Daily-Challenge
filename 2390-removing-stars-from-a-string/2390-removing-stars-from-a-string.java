class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='*'){
                count++;
            }else{
                if(count>0){
                    count--;
                }else{
                    count = 0;
                    ans.append(ch);
                }
            }
        }
        return ans.reverse().toString();
        
    }
}