class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        return solve(digits);
    }
    
    String map[]={ "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> solve(String digits){
        if(digits.length()==0){
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = digits.charAt(digits.length()-1);
        String rstr = digits.substring(0, digits.length()-1);
        List<String> temp = solve(rstr);
        List<String> res = new ArrayList<>();
        
        // int num = ch-'0';
        
        for(String str: temp){
            String strr = map[ch-'0'];
            for(char rch: strr.toCharArray()){
                res.add(str+rch);
            }
        }
        return res;
        
    }
}