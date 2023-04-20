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
    public int widthOfBinaryTree(TreeNode root) {
        return solve(root, 0, 1, new ArrayList<>(), new ArrayList<>());
    }
    public int solve(TreeNode root, int level, int order, ArrayList<Integer> start, ArrayList<Integer> end){
        if(root==null) return 0;
        if(start.size()==level){
            start.add(order);
            end.add(order);
        }
        end.set(level, order);
        int ans = end.get(level)-start.get(level)+1;
        int left = solve(root.left, level+1, 2*order, start, end);
        int right = solve(root.right, level+1, 2*order+1, start, end);
        return Math.max(ans, Math.max(left, right));
    }
}