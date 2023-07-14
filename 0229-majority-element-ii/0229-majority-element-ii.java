class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        int val1 = nums[0], val2 = nums[0], count1 = 1, count2 = 0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val1){
                count1++;
            }else if(nums[i]==val2){
                count2++;
            }else{
                if(count1==0){
                    val1 = nums[i];
                    count1 =1;
                }else if(count2 == 0){
                    val2 = nums[i];
                    count2 = 1;
                }else{
                    count1--;
                    count2--;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        if(isGreater(nums, val1)){
            res.add(val1);
        }
        if(val2 != val1 && isGreater(nums, val2)){
            res.add(val2);
        }
        
        return res;
    }
    public boolean isGreater(int arr[], int val){
        int count = 0;
        for(int ele: arr){
            if(ele == val){
                count++;
            }
        }
        return count > arr.length/3;
    }
}