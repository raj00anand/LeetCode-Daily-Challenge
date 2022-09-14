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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res=new ArrayList<>();
        healper(root, res, "");
        return res;
    }
    public void healper(TreeNode root, List<String> res, String temp){
        if(root==null){
            return;
        }
        temp += Integer.toString(root.val);
        healper(root.left, res, temp+"->");
        healper(root.right, res,temp+"->");
        
        if(root.left==null && root.right==null){
            res.add(temp);
        }
    }
}