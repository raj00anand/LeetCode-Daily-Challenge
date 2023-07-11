/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<TreeNode> rootToNodePath = rootToNodePath(root, target);
        kDistance(rootToNodePath, k);
        return ans;
    }
    public void kDistance(List<TreeNode> temp, int k){
        if(temp.size()==0){
            return;
        }
        for(int i=0;i<temp.size();i++){
            printKDown(temp.get(i), k-i, i==0? null: temp.get(i-1));
        }
    }
    public void printKDown(TreeNode node, int k, TreeNode blocker){
        if(node == null || k<0 || node == blocker){
            return;
        }
        if(k==0){
            ans.add(node.val);
        }
        printKDown(node.left, k-1, blocker);
        printKDown(node.right, k-1, blocker);
    }
    public List<TreeNode> rootToNodePath(TreeNode root, TreeNode target){
        if(root==null){
            return null;
        }
        
        if(root == target){
            List<TreeNode> ans = new ArrayList<>();
            ans.add(root);
            return ans;
        }
        
        List<TreeNode> left = rootToNodePath(root.left, target);
        if(left!=null){
            left.add(root);
            return left;
        }
        List<TreeNode> right = rootToNodePath(root.right, target);
        if(right!=null){
            right.add(root);
            return right;
        }
        return null;
    }
}