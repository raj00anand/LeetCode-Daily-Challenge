class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s = m+n-1;
        int i= m-1, j=n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[s] = nums1[i];
                i--;
                s--;
            }else{
                nums1[s] = nums2[j];
                j--;
                s--;
            }
        }
    }
}