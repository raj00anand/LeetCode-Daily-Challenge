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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            return temp;
        }
        Queue<TreeNode> mainQ=new ArrayDeque<>();
        mainQ.add(root);
        while(depth-->2){
            
            Queue<TreeNode> tempQ=new ArrayDeque<>();
            while(mainQ.size()>0){
                TreeNode rn=mainQ.remove();
                if(rn.left!=null) tempQ.add(rn.left);
                if(rn.right!=null) tempQ.add(rn.right);
            }
            mainQ=tempQ;
            
        }
        while(mainQ.size()>0){
            TreeNode rn=mainQ.remove();
            TreeNode temp=rn.left;
            rn.left=new TreeNode(val);
            rn.left.left=temp;
            
            temp=rn.right;
            rn.right=new TreeNode(val);
            rn.right.right=temp;
        }
        return root;
    }
}