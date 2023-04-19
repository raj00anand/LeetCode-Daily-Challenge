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
    public int longestZigZag(TreeNode root) {
        Pair res = solve(root);
        return res.maxLen;
        
    }
    public Pair solve(TreeNode root){
        if(root==null){
            return new Pair();
        }
        Pair left = solve(root.left);
        Pair right = solve(root.right);
        
        Pair ans=new Pair();
        ans.maxLen = Math.max(Math.max(left.maxLen, right.maxLen), Math.max(left.backward, right.forward)+1);
        ans.forward = left.backward+1;
        ans.backward = right.forward+1;
        return ans;
    }
}
class Pair{
    int backward=-1;
    int forward=-1;
    int maxLen=0;
    
}