class Solution {
    public int minFlips(int a, int b, int c) {
        if(a==0 && b==0 && c==0){
            return 0;
        }
        
        int count = 0;
        int bitA = (a & 1), bitB = (b & 1) , bitC = (c & 1);
        if(bitC==0){
            if(bitA!=0) count++;
            if(bitB!=0) count++;
        }else{
            if(bitA==0 && bitB==0){
                count++;
            }
        }
        return count+minFlips(a>>1, b>>1, c>>1);
    }
}