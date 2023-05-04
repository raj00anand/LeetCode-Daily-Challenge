class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        Queue<Integer> rad = new ArrayDeque<>();
        Queue<Integer> dir = new ArrayDeque<>();
        for(int i=0;i<senate.length();i++){
            char ch=senate.charAt(i);
            if(ch=='R'){
                rad.add(i);
            }else{
                dir.add(i);
            }
        }
        while(!rad.isEmpty() && !dir.isEmpty()){
            int r=rad.remove();
            int d=dir.remove();
            if(r<d){
                rad.add(r+n);
            }else{
                dir.add(d+n);
            }
        }
        return (rad.isEmpty()) ? "Dire":"Radiant";
    }
}