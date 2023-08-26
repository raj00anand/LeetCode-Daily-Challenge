class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, ((a, b)-> a[0]-b[0]));
        
        int count = 0;
        int preValue = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(preValue <= intervals[i][0]){
                preValue = intervals[i][1];
            }else{
                count++;
                preValue = Math.min(preValue, intervals[i][1]);
            }
        }
        return count;
    }
}