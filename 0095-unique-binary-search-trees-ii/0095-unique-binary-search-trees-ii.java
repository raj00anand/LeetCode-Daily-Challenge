/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return solve(1, n);
    }
    public List<TreeNode> solve(int st, int end){
        if(st>end){
            List<TreeNode> bres = new ArrayList<>();
            bres.add(null);
            return bres;
        }
        List<TreeNode> res = new ArrayList<>();
        for(int i=st; i<=end;i++){
            List<TreeNode> left = solve(st, i-1);
            List<TreeNode> right = solve(i+1, end);
            
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode root = new TreeNode();
                    root.val = i;
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}