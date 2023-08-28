class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length==1){
            return 1;
        }
        Arrays.sort(pairs, ((a,b)->(a[1]-b[1])));
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<pairs.length-1;i++){
            int count = 1;
            int preVal = pairs[i][1];
            for(int j=i+1;j<pairs.length;j++){
                if(preVal < pairs[j][0]){
                    count++;
                    preVal = pairs[j][1];
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}