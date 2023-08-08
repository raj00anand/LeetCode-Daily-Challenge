class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String ans = "";
        
        for(int i=arr.length-1;i>=0;i--){
            // System.out.println(arr[i]);
            ans += arr[i];
            ans = ans.trim();
            ans += " ";
            
            
        }
        return ans.trim();
    }
}