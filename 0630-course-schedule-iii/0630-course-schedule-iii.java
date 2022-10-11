class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b)->(a[1]-b[1]));
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        //int count=0;
        int time=0;
        for(int arr[]: courses){
            time += arr[0];
            pq.add(arr[0]);
            if(time>arr[1]){
                time -=pq.remove();
            }
        }
        return pq.size();
    }
}