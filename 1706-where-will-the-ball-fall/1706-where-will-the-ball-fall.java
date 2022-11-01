class Solution {
    public int[] findBall(int[][] grid) {
        int res[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            res[i]=findAnswer(0, i, grid);
        }
        return res;
    }
    public int findAnswer(int row, int col, int[][] grid){
        if(row==grid.length){
            return col;
        }
        int nextcol=col+grid[row][col];
        if(nextcol<0 || nextcol>grid[0].length-1 || grid[row][col]!=grid[row][nextcol]){
            return -1;
        }
        return findAnswer(row+1, nextcol, grid);
    }
}