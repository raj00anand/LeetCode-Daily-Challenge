class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int j=0;
        Deque<Integer> que = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!que.isEmpty() && nums[i]>=nums[que.peekLast()]){
                que.pollLast();
            }
            que.offerLast(i);
        }
        res[j++]=nums[que.peekFirst()];
        for(int i=k;i<n;i++){
            if(i-k==que.peekFirst()){
                que.pollFirst();
            }
            
            while(!que.isEmpty() && nums[i]>=nums[que.peekLast()]){
                que.pollLast();
            }
            que.offerLast(i);
            res[j++] = nums[que.peekFirst()];
        }
        
        return res;
        
    }
}