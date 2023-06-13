class Solution {
    public int equalPairs(int[][] grid) {
         
        int count=0;
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                temp.add(grid[i][j]);
            }
            
            
            for(int k=0;k<grid[0].length;k++){
                ArrayList<Integer> temp1=new ArrayList<>();
                for(int l=0;l<grid.length;l++){
                    temp1.add(grid[l][k]);
                }
                if(temp.equals(temp1)){
                    count++;
                }
            }
            
        }
        return count;
    }
}