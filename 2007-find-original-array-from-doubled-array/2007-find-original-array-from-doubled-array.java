class Solution {
    public int[] findOriginalArray(int[] changed) {
        Queue<Integer> que=new ArrayDeque<>();
        int ans[]=new int[changed.length/2];
        Arrays.sort(changed);
        int i=0;
        for(int val: changed){
            if(!que.isEmpty() && que.peek()==val){
                ans[i++]=que.remove()/2;
            }else{
                que.add(val*2);
            }
        }
        
        return que.size()>0 ? new int[]{}:ans;
    }
}