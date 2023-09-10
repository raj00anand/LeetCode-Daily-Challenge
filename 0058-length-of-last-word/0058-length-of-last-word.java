class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i].trim();
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != " "){
                return arr[i].length();
            }
        }
        
        return 0;
    }
}