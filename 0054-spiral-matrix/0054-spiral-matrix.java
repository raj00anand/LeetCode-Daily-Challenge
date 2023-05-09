class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int minr=0;
        int maxr=matrix.length-1;
        int minc=0;
        int maxc=matrix[0].length-1;
        int n=matrix.length*matrix[0].length;
        while(list.size()!=n){
            for(int j=minc;j<=maxc && list.size()!=n;j++){
                list.add(matrix[minr][j]);
            }
            minr++;
            for(int i=minr;i<=maxr && list.size()!=n;i++){
                list.add(matrix[i][maxc]);
            }
            maxc--;
            for(int j=maxc;j>=minc && list.size()!=n;j--){
                list.add(matrix[maxr][j]);
            }
            maxr--;
            for(int i=maxr;i>=minr && list.size()!=n;i--){
                list.add(matrix[i][minc]);
            }
            minc++;
        }
        return list;
    }
}