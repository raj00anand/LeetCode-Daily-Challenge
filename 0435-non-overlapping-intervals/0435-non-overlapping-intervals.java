class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int count=0;
        int preval=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(preval>intervals[i][0]){
                count++;
                preval=Math.min(intervals[i][1],preval);
            }else{
                preval=intervals[i][1];
            }
        }
        return count;
    }
}