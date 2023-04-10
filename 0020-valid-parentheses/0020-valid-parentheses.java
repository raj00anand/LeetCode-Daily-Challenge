class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }else if(ch=='{'){
                st.push(ch);
            }else if(ch=='['){
                st.push(ch);
            }else if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else if(ch=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }else{
                    st.push(ch);
                }
                
            }else if(ch==']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }else{
                    st.push(ch);
                }
                
            }
        }
        return st.size()==0;
    }
}