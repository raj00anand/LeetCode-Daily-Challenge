class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count = 0;
        int temp = 0;
        for(int i=m-1;i>=0;i--){
            int j=temp;
            while(j<n && grid[i][j]>=0){
                j++;
            }
            count += n - j;
            temp = j;
            
        }
        return count;
    }
}