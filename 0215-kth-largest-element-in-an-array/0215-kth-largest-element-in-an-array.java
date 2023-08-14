class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<n;i++){
            if(pq.size()<k){
                pq.add(nums[i]);
            }else{
                if(pq.peek()<nums[i]){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        // System.out.println(pq.size());
        return pq.peek();
    }
}