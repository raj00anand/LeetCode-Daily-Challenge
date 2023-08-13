class Solution {
    public String decodeString(String s) {
        
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch==']'){
                StringBuilder sb = new StringBuilder();
                boolean flag = false;
                while(flag==false){
                    char rch = st.pop();
                    if(rch!='['){
                        sb.append(rch);
                    }else{
                        flag=true;
                    }
                    
                    
                }
                StringBuilder k= new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k.append(st.pop());
                }
                k.reverse();
                int temp = Integer.parseInt(k.toString());
                System.out.println(temp);
                sb.reverse();
                String res = "";
                for(int i=0;i<temp;i++){
                    res += sb;
                }
                for(int i=0;i<res.length();i++){
                    st.push(res.charAt(i));
                }
                
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
        
    }
}