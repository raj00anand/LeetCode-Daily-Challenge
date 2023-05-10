class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int minr=0, minc=0, maxr=n-1, maxc=n-1;
        int count=1;
        while(count<(n*n)){
            for(int i=minr, j=minc;j<=maxc;j++){
                res[i][j]=count++;
            }
            minr++;
            for(int i=minr, j=maxc;i<=maxr;i++){
                res[i][j]=count++;
            }
            maxc--;
            for(int i=maxr, j=maxc;j>=minc;j--){
                res[i][j]=count++;
            }
            maxr--;
            for(int i=maxr,j=minc;i>=minr;i--){
                res[i][j]=count++;
            }
            minc++;
        }
        if(n%2!=0){
            res[n/2][n/2]=count;
        }
        return res;
    }
}