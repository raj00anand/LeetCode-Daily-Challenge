class Solution {
    public String largestNumber(int[] nums) {
        String str[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=nums[i]+"";
        }
        Arrays.sort(str, (a,b)->{
            String s1=a+""+b;
            String s2=b+""+a;
            return s2.compareTo(s1);
        });
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        if(sb.charAt(0)=='0') return "0";
        return sb.toString();
    }
}