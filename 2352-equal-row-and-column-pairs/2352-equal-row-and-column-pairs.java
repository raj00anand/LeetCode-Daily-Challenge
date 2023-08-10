class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> row = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            String str = "";
            for(int j=0;j<grid.length;j++){
                str += grid[i][j]+",";
            }
            row.put(str, row.getOrDefault(str, 0)+1);
        }
        // HashSet<String> col = new HashSet<>();
        int count=0;
        for(int j=0;j<grid.length;j++){
            String str = "";
            for(int i=0;i<grid.length;i++){
                str += grid[i][j]+",";
            }
            if(row.containsKey(str)){
                int temp = row.get(str);
                count = count + temp;
            }
        }
        return count;
    }
}