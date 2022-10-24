class Solution {
    public int maxLength(List<String> arr) {
        return solve(arr, 0, "");
    }
    public int solve(List<String> arr,int i, String asf){
        if(i==arr.size()){
            if(valid(asf)){
                return asf.length();
            }
            return 0;
        }
        
        
        int size1=solve(arr, i+1, asf);
        int size2=solve(arr, i+1, asf+arr.get(i));
        
        return Math.max(size1, size2);
    }
    public boolean valid(String str){
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
            
            if(freq[ch-'a']>1){
                return false;
            }
        }
        return true;
    }
}