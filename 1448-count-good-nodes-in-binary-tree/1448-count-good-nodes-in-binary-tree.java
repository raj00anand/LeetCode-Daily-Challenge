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
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        
        return solve(root, root.val);
        
    }
    public int solve(TreeNode root, int max){
        if(root==null){
            return 0;
        }
        max=Math.max(root.val, max);
        int left=solve(root.left, max);
        int right=solve(root.right, max);
        
        int count=left+right;
        if(root.val>=max){
            count++;
        }
        return count;
    }
}