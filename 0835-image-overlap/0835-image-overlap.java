class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<Pair<Integer,Integer>> img1_ones=non_zero_cells(img1);
        List<Pair<Integer, Integer>> img2_ones=non_zero_cells(img2);
        
        int maxOverlaps=0;
        HashMap<Pair<Integer, Integer>, Integer> count=new HashMap<>();
        for(Pair<Integer, Integer> a: img1_ones)
            for(Pair<Integer, Integer> b: img2_ones){
                Pair<Integer, Integer> vec=new Pair<>(b.getKey()-a.getKey(), b.getValue()-a.getValue());
                
                if(count.containsKey(vec)){
                    count.put(vec, count.get(vec)+1);
                }else{
                    count.put(vec,1);
                }
                maxOverlaps=Math.max(maxOverlaps, count.get(vec));
            }
        return maxOverlaps;
    }
    public List<Pair<Integer, Integer>> non_zero_cells(int[][] M){
        List<Pair<Integer, Integer>> res=new ArrayList<>();
        for(int row=0; row<M.length;row++){
            for(int col=0;col<M[0].length;col++){
                if(M[row][col]==1)
                    res.add(new Pair<>(row, col));
                
                
            }
        }
        return res;
    }
    
}