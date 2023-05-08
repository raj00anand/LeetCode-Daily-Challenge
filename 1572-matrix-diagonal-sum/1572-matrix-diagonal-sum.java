class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int res=0;
        for(int i=0,j=0;i<n;i++,j++){
            res += mat[i][j];
        }
        for(int i=0,j=n-1;i<n;i++, j--){
            res += mat[i][j];
        }
        if(n%2!=0){
            res -= mat[n/2][n/2];
        }
        
        return res;
    }
}