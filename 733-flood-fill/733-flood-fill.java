class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //boolean visited[][]=new boolean[image.length][image[0].length];
        if(image[sr][sc]==color){
            return image;
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(i==sr && j==sc){
                    dfs(image, i, j, color, image[sr][sc]);
                }
            }
        }
        return image;
        
    }
    public void dfs(int[][] image, int i, int j, int color, int blocker){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]!=blocker){
            return;
        }
        
        
        image[i][j]=color;
        dfs(image, i+1, j, color, blocker);
        dfs(image, i-1, j, color, blocker);
        dfs(image, i, j-1, color, blocker);
        dfs(image, i, j+1, color, blocker);
        
    }
}