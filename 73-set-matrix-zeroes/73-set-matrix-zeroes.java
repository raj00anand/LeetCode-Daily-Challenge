class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> cset=new HashSet<>();
        Set<Integer> rset=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    cset.add(j);
                    rset.add(i);
                }
            }
        }
        for(int key: cset){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(j==key){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        for(int key: rset){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(i==key){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        
    }
}