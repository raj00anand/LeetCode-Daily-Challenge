class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), ans);
        return ans;
        
    }
    public void solve(int idx, int n, int k, List<Integer> temp, List<List<Integer>> ans){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<=n;i++){
            temp.add(i);
            solve(i+1, n,k, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}