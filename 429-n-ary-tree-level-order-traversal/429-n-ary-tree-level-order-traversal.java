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
        Queue<Node> que=new ArrayDeque<>();
        que.add(root);
        while(que.size()>0){
            List<Integer> level=new ArrayList<>();
            int size=que.size();
            for(int i=0;i<size;i++){
                Node rn=que.remove();
                level.add(rn.val);
                for(int j=0;j<rn.children.size();j++){
                    que.add(rn.children.get(j));
                }
                
            }
            ans.add(level);
        }
        return ans;
    }
    
}