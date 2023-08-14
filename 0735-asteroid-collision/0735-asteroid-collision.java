class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        st.push(asteroids[0]);
        int i=1;
        while(i<n){
            int val1 = st.peek();
            int val2 = asteroids[i];
            
            while((!st.isEmpty()) && ((val1>0 && val2<0) || (val1<0 && val1>0))){
                if(Math.abs(val1)>Math.abs(val2)){
                    i++;
                    if(i<n){
                        val2 = asteroids[i];
                    }else{
                        break;
                    }
                }else if(Math.abs(val1)<Math.abs(val2)){
                    st.pop();
                    if(!st.isEmpty()){
                        val1 = st.peek();
                    }else{
                        break;
                    }
                }else{
                    st.pop();
                    if(!st.isEmpty()){
                        val1 = st.peek();
                    }
                    
                    
                    i++;
                    if(i<n){
                        val2 = asteroids[i];
                    }else{
                        break;
                    }
                    
                    
                }
            }
            if(i<n){
                st.push(asteroids[i]);
            }else{
                break;
            }
            i++;
            
        }
        
        int ans[] = new int[st.size()];
        int k=ans.length-1;
        while(!st.isEmpty()){
            ans[k--] = st.pop();
        }
        // Arrays.sort(ans);
        return ans;
        
    }
}