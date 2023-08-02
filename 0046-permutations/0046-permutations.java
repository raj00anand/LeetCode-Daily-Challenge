class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, n, new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int nums[], int n, List<Integer> temp, List<List<Integer>> ans){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            solve(nums, n, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}