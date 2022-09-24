class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums, new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int nums[], ArrayList<Integer> temp, List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
        if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            solve(nums, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}