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
    public List<TreeNode> allPossibleFBT(int n) {
        return healper(n);
    }
    public List<TreeNode> healper(int n){
        if(n==1){
            List<TreeNode> bres=new ArrayList<>();
            bres.add(new TreeNode(0));
            return bres;
        }
        List<TreeNode> res=new ArrayList<>();
        for(int i=1;i<n;i+=2){
            List<TreeNode> left=healper(i);
            List<TreeNode> right=healper(n-i-1);
            
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode root=new TreeNode(0);
                    root.left=l;
                    root.right=r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}