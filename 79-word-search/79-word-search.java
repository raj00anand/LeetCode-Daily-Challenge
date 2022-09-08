class Solution {
    boolean ans= false;
    public boolean exist(char[][] board, String word) {
        int[][] vis = new int [board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    find(vis,board,word,i,j,0);
                }
            }
        }
        return ans;
    }
    public void find(int[][] vis,char[][] board,String word,int i,int j,int s){
        if(s==word.length()){
            ans=true;
            return;
        }
        boolean check = (i>=board.length)||
                        (j>=board[0].length)||
                        (i<0)||
                        (j<0)||
                        (vis[i][j]==1)||
                        (board[i][j] != word.charAt(s));
        if(check)
            return;
        vis[i][j] = 1;
        find(vis,board,word,i+1,j,s+1);
        find(vis,board,word,i,j+1,s+1);
        find(vis,board,word,i,j-1,s+1);
        find(vis,board,word,i-1,j,s+1);
        vis[i][j] = 0;
    }
}