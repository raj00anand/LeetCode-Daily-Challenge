class Solution {
    public int maxArea(int[] height) {
        int res = Integer.MIN_VALUE;
        int left = 0, right = height.length -1;
        while(left<right){
            int area = Math.min(height[left], height[right]) * (right-left);
            // System.out.println(Math.min(height[left], height[right]));
            // System.out.println(area);
            if(height[left]<height[right]){
                left++;
            }else if(height[left]> height[right]){
                right--;
            }else{
                left++;
                right--;
            }
            
            res = Math.max(area, res);
        }
        return res;
    }
}