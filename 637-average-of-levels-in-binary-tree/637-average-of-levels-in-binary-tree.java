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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        LinkedList<TreeNode> que=new LinkedList<>();
        que.addLast(root);
        while(que.size()>0){
            int size=que.size();
            List<Integer> temp=new ArrayList<>();
            while(size-->0){
                TreeNode rn=que.removeFirst();
                temp.add(rn.val);
                if(rn.left!=null) que.addLast(rn.left);
                if(rn.right!=null) que.addLast(rn.right);
            }
            double avg=0;
            double avgsize=temp.size();
            for(int val: temp){
                avg += val;
            }
            ans.add(avg/avgsize);
        }
        return ans;
    }
}