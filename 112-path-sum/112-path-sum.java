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
        //targetSum -= root.val;
       // System.out.println(targetSum);
        if(root.left==null && root.right==null && root.val==targetSum){
            return true;
        }
        boolean left=solve(root.left, targetSum-root.val);
        boolean right=solve(root.right, targetSum-root.val);
        //targetSum +=root.val;
       // System.out.println(targetSum);
        if(left==true || right==true){
            return true;
        }else{
            return false;
        }
        
        //return false;
    }
}