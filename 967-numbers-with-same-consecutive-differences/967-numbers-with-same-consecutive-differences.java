class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
       List<Integer> ans=new ArrayList<>();
        for(int num=1;num<10;num++){
            dfs(n-1, num, k, ans);
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
    public void dfs(int n, int num, int k, List<Integer> ans){
        if(n==0){
            ans.add(num);
            return;
        }
        List<Integer> nextDigits=new ArrayList<>();
        Integer currDigit=num%10;
        nextDigits.add(currDigit+k);
        if(k!=0)
            nextDigits.add(currDigit-k);
        
        for(Integer nextDigit : nextDigits){
            if(0<=nextDigit && nextDigit<10){
                Integer newNum = num*10 + nextDigit;
                dfs(n-1, newNum, k, ans);
            }
        }
    }
}