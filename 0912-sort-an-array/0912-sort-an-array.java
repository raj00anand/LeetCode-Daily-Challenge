class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
        
    }
    public int[] mergeSort(int[] nums, int start, int end){
        if(start==end){
            int bs[]=new int[1];
            bs[0]=nums[end];
            return bs;
        }
        
        int mid=(start+end)/2;
        int left[]= mergeSort(nums, start, mid);
        int right[]=mergeSort(nums, mid+1, end);
        
        int res[]=mergeTwoSortedArray(left, right);
        return res;
    }
    public int[] mergeTwoSortedArray(int left[], int right[]){
        int n=left.length+right.length;
        int res[]=new int[n];
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                res[k]=left[i];
                i++;
            }else{
                res[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            res[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            res[k]=right[j];
            k++;
            j++;
        }
        return res;
    }
}