class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Arrays.sort(letters);
        
        
        if(target >= letters[letters.length-1]){
            return letters[0];
        }
        int low = 0, hi = letters.length-1;
        while(low<=hi){
            int mid=(low+hi)/2;
            
            if(letters[mid] <= target){
                low = mid+1;
            }else{
                hi = mid-1;
            }
        }
        
        return letters[low];
    }
}