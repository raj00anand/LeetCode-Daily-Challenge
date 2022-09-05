/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        solve(root, 0, ans);
        return ans;
    }
    public void solve(Node node,int level, List<List<Integer>> ans){
        if(node==null) return;
        
        if(level>=ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(node.val);
        
        for(Node n: node.children){
            solve(n, level+1, ans);
        }
    }
    
}