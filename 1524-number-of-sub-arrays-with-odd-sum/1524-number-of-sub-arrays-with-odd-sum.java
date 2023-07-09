class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = (int)1e9+7;
        int prefix[]=new int[arr.length];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            prefix[i]=sum;
        }
        int count = 0, odd=0, even=0;
        for(int i=0;i<prefix.length;i++){
            if(prefix[i]%2!=0){
                odd++;
                count++;
                count = (count+even)%mod;
            }else{
                even++;
                count = (count+odd)%mod;
            }
             
        }
        return count;
        
    }
}