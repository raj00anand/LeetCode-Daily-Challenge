class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double ans=0;
        for(int i=1;i<salary.length-1;i++){
            ans += salary[i];
        }
        ans=ans/(salary.length-2);
        return ans;
        
    }
}