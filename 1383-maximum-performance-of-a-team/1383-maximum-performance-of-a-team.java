class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=efficiency[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr, (a,b)->(b[0]-a[0]));
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
        long maxPerformace=0, maxSpeed=0;
        for(int i=0;i<n;i++){
            
            if(pq.size()>=k){
                maxSpeed -= pq.remove();
                
            }
            pq.add(arr[i][1]);
            maxSpeed += arr[i][1];
                
            maxPerformace=Math.max(maxPerformace, maxSpeed*arr[i][0]);
        }
        return (int) (maxPerformace % 1000000007);
    }
}