class Solution {
    int n;
    public int shortestBridge(int[][] grid) {
        n=grid.length;
        boolean visited=false;
        Queue<int[]> que = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited==false){
                    dfs(i, j, grid);
                    visited=true;
                }
                if(visited && grid[i][j]==1){
                    que.add(new int[]{i,j});
                }
            }
        }
        int level=0;
        int d[][]={{0,1}, {0,-1},{-1, 0}, {1, 0}};
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                int temp[]=que.remove();
                for(int j=0;j<d.length;j++){
                    int x=temp[0]+d[j][0];
                    int y=temp[1]+d[j][1];
                    
                    if(x<0 || x>=n || y<0 || y>=n) continue;
                    if(grid[x][y]==2) return level;
                    else if(grid[x][y]==1) continue;
                    else if(grid[x][y]==0){
                        grid[x][y]=1;
                        que.add(new int[]{x, y});
                    }
                }
            }
            level++;
        }
        return level;
        
    }
    public void dfs(int i, int j, int[][] grid){
        grid[i][j]=2;
        
        if(i-1>=0 && grid[i-1][j]==1) dfs(i-1, j, grid);
        if(i+1<n && grid[i+1][j]==1) dfs(i+1, j, grid);
        if(j-1>=0 && grid[i][j-1]==1) dfs(i, j-1, grid);
        if(j+1<n && grid[i][j+1]==1) dfs(i, j+1, grid);
    }
}