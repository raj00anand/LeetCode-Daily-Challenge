class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        
        int pre = nums[0];
        String res = pre+"";
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];
            if(nums[i]-nums[i-1] == 1){
                continue;
            }else{
                
                
                if(pre != nums[i-1]){
                   res += "->"+nums[i-1]; 
                }
                ans.add(res);
                res = curr+"";
                pre = curr;
            }
        }
        if(pre != nums[nums.length-1]){
            res += "->"+nums[nums.length-1]; 
        }
        ans.add(res);
        
        return ans;
    }
}