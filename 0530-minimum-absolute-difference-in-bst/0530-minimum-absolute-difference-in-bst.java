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
    int ans = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        return ans;
    }
    public void solve(TreeNode root){
        if(root==null){
            return;
        }
        solve(root.left);
        if(pre!=null){
            ans = Math.min(ans, root.val-pre.val);
        }
        pre = root;
        solve(root.right);
    }
    
}