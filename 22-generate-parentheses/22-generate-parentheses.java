class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        healper(n, 0, 0,"", res);
        return res;
    }
    public void healper(int n, int l, int r,String temp, List<String> res){
        if(temp.length()==2*n){
            res.add(temp);
            return;
        }
        if(l<n){
            healper(n,l+1,r, temp+"(", res);
        }
        if(r<l){
            healper(n,l,r+1, temp+")",res);
        }
    }
}