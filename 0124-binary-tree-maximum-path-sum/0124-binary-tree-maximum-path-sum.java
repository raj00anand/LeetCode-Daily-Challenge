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
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        healper(root);
        return maxSum;
    }
    public int healper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=healper(root.left);
        int right=healper(root.right);
        
        int maxLeftRight=Math.max(left, right);
        int maxNode=Math.max(root.val,(root.val+maxLeftRight));
        int maxAll=Math.max(maxNode, root.val+left+right);
        
        maxSum=Math.max(maxSum, maxAll);
        
        return maxNode;
    }
}