class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int ans[]=new int[nums.length];
        int i=0;
        int total=0;
        for(int val: nums){
            if(val%2==0){
                total += val;
            }
        }
        for(int arr[]: queries){
            int idx=arr[1];
            int val=arr[0];
            nums[idx]=nums[idx]+val;
            boolean oldNum=nums[idx]%2==0? true: false;
            boolean oldVal=val%2==0? true: false;
            
            if(oldNum && !oldVal){
                ans[i]= total + nums[idx];
                total = total +nums[idx];
               
                i++;
            }else if(!oldNum && !oldVal){
                ans[i] = total - (nums[idx]-val);
                total = total -(nums[idx]-val);
                
                i++;
            }else if(oldNum && oldVal){
                ans[i]=total + val;
                total=total+val;
                i++;
            }else{
                ans[i]=total;
                total = total;
                i++;
            }
        }
        return ans;
    }
}