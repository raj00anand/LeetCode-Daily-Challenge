class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n= obstacleGrid.length;
        int m= obstacleGrid[0].length;
        int dp[][]=new int[n+1][m+1];
        return solve(0, 0, obstacleGrid, n, m, dp);
    }
    public int solve(int i, int j, int[][] obstacleGrid, int n,int m, int dp[][]){
        if(i<0 || i>=n || j<0 || j>=m || obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int count=0;
        
        count += solve(i+1, j, obstacleGrid, n, m, dp);
        count += solve(i, j+1, obstacleGrid, n, m, dp);
        
        dp[i][j]=count;
        
        return count;
    }
}