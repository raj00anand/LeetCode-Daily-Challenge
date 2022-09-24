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
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        healper(root, new ArrayList<Integer>(), ans, targetSum, 0);
        return ans;
    }
    public void healper(TreeNode root, List<Integer> temp, List<List<Integer>> ans, int targetSum, int sum){
        if(root==null){
            return;
        }
        temp.add(root.val);
        sum += root.val;
        if(root.left==null && root.right==null && sum==targetSum){
            ans.add(new ArrayList<>(temp));
        }
        healper(root.left, temp, ans, targetSum, sum);
        healper(root.right, temp, ans, targetSum, sum);
        temp.remove(temp.size()-1);
    }
}