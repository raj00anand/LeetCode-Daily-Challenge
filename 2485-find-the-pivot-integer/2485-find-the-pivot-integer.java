class Solution {
    public int pivotInteger(int n) {
        int totalSum = (n*(n+1))/2;
        
        // System.out.println(totalSum);
        int currentSum = 0;
        for(int i=1;i<=n;i++){
            currentSum += i;
            
            if(currentSum==totalSum){
                return i;
            }
            totalSum -= i;
        }
        return -1;
    }
}