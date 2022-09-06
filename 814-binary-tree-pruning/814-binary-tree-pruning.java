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
    public TreeNode pruneTree(TreeNode root) {
        return solve(root);
    }
    public TreeNode solve(TreeNode root){
        if(root==null) return null;
        
        TreeNode left=solve(root.left);
        TreeNode right=solve(root.right);
        
        if(left==null){
            root.left=null;
        }
        if(right==null){
            root.right=null;
        }
        
        if(left==null && right==null && root.val==0){
            root=null;
            return null;
        }
        return root;
    }
}