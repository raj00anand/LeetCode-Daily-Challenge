class Solution {
    String map[]={" "," ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        return solve(digits);
    }
    public List<String> solve(String digits){
        if(digits.length()==0){
            List<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=digits.charAt(0);
        String rstr=digits.substring(1);
        List<String> mres=solve(rstr);
        ArrayList<String> res=new ArrayList<>();
        String mstr=map[ch-'0'];
        for(int i=0;i<mstr.length();i++){
            char mch=mstr.charAt(i);
            for(String nstr: mres){
                res.add(mch+nstr);
            }
        }
        return res;
    }

}