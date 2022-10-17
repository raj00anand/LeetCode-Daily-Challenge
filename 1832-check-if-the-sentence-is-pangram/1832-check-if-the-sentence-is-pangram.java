class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        int[] arr=new int[26];
        for(char ch: sentence.toCharArray()){
            arr[ch-'a']++;
        }
        
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                flag=false;
                break;
            }
        }
        return flag;
        
    }
}