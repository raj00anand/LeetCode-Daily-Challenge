class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int x = m, y=n;
        for(int i=0;i<ops.length;i++){
            x = Math.min(ops[i][0], x);
            y = Math.min(ops[i][1], y);
        }
        return x*y;
    }
}