class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        //sort array on the basis of 1st index and if first index equal sort on decending order
        Arrays.sort(properties, (a,b)->(a[0]==b[0]) ? Integer.compare(b[1],a[1]) : Integer.compare(a[0], b[0]));
        
        int len=properties.length;
        int noOfWeakChar=0;
        int max=properties[len-1][1];
        for(int i=len-2;i>=0;i--){
            if(properties[i][1]<max){
                noOfWeakChar++;
            }else{
                max=properties[i][1];
            }
        }
        return noOfWeakChar;
    }
}