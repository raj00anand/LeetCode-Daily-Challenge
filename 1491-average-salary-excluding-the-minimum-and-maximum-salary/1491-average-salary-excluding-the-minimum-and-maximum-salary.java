class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            max=Math.max(max, salary[i]);
            min=Math.min(min, salary[i]);
        }
        double ans = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]==min || salary[i]==max) continue;
            ans += salary[i];
        }
        ans=ans/(salary.length-2);
        return ans;
        
    }
}