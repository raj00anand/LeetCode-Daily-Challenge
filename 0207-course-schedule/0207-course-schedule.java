class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int visited[]=new int[numCourses];
        ArrayDeque<Integer> que=new ArrayDeque<>();
        int count=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList());
        }
        for(int i=0;i<prerequisites.length;i++){
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i=0;i<numCourses;i++){
            for(int val: list.get(i)){
                visited[val]++;
            }
        }
        
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0) que.add(i);
        }
        while(que.size()>0){
            int ele=que.remove();
            count++;
            
            for(int val: list.get(ele)){
                visited[val]--;
                if(visited[val]==0){
                    que.add(val);
                }
            }
        }
        if(count==numCourses){
            return true;
        }else{
            return false;
        }
        
        
    }
}