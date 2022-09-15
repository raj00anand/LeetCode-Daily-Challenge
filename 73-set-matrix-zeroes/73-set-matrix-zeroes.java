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
        
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(cset.contains(j) || rset.contains(i)){
                        matrix[i][j]=0;
                    }
                }
            }
        
        
            
        
        
    }
}