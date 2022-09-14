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
    public int pseudoPalindromicPaths (TreeNode root) {
        int count=0, path=0;
        Deque<Pair<TreeNode, Integer>> st=new ArrayDeque<>();
        st.push(new Pair(root, 0));
        while(st.size()>0){
            Pair<TreeNode, Integer> rp=st.pop();
            TreeNode node=rp.getKey();
            path=rp.getValue();
            
            if(node!=null){
                path=path ^ (1<<node.val);
                
                if(node.left==null && node.right==null){
                    if((path & (path-1))==0){
                        count++;
                    }
                }
                else{
                    st.push(new Pair(node.right, path));
                    st.push(new Pair(node.left, path));
                }
            }
        }
        return count;
    }
}