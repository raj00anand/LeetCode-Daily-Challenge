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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum);
    }
    public boolean solve(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        targetSum -= root.val;
        if(root.left==null && root.right==null){
            if(targetSum==0){
                return true;
            }
        }
        boolean left=solve(root.left, targetSum);
        boolean right=solve(root.right, targetSum);
        targetSum +=root.val;
        if(left==true || right==true){
            return true;
        }else{
            return false;
        }
        
        //return false;
    }
}