class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapt=new HashMap<>();
        HashMap<Character, Integer> maps=new HashMap<>();
        for(char ch: t.toCharArray()){
            mapt.put(ch, mapt.getOrDefault(ch, 0)+1);
        }
        int required=mapt.size();
        
        int left=0, right=0;
        
        int formed=0;
        
        int ans[]={-1,0, 0};
        while(right<s.length()){
            char ch=s.charAt(right);
            int count=maps.getOrDefault(ch,0);
            maps.put(ch, count+1);
            
            
            if(mapt.containsKey(ch) && maps.get(ch).intValue()==mapt.get(ch).intValue()){
                formed++;
            }
            while(left<=right && formed==required){
                ch=s.charAt(left);
                
                if(ans[0]==-1 || right-left+1<ans[0]){
                    ans[0]=right-left+1;
                    ans[1]=left;
                    ans[2]=right;
                }
                maps.put(ch, maps.get(ch)-1);
                if(mapt.containsKey(ch) && maps.get(ch).intValue()<mapt.get(ch).intValue()){
                    formed--;
                }
                left++;
            }
            right++;
        }
        return ans[0]==-1? "": s.substring(ans[1], ans[2]+1);
    }
    
}