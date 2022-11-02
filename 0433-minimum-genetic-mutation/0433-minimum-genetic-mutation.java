class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        q.add(start);
        set.add(start);
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int j=0;j<size;j++){
                String remStr=q.remove();
                if(remStr.equals(end)){
                    return ans;
                }
                for(char ch:new char[]{'A', 'C', 'G', 'T'}){
                    for(int i=0;i<remStr.length();i++){
                        String nbr=remStr.substring(0,i)+ch+remStr.substring(i+1);
                        if(!set.contains(nbr) && Arrays.asList(bank).contains(nbr)){
                            q.add(nbr);
                            set.add(nbr);
                        }
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}