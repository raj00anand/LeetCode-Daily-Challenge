//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[R*C];
        int k=0;
        int minr=0, maxr=R-1, minc=0, maxc=C-1;
        int cnt=0;
        while(cnt<R*C){
            for(int i=minr, j=minc;j<=maxc && cnt<R*C;j++){
                st.push(a[i][j]);
                cnt++;
            }
            minr++;
            for(int i=minr, j=maxc;i<=maxr && cnt<R*C;i++){
                st.push(a[i][j]);
                cnt++;
            }
            maxc--;
            for(int i=maxr, j=maxc;j>=minc && cnt<R*C;j--){
                st.push(a[i][j]);
                cnt++;
            }
            maxr--;
            for(int i=maxr, j=minc;i>=minr && cnt<R*C;i--){
                st.push(a[i][j]);
                cnt++;
            }
            minc++;
            
            
        }
        //reverse(ans, ans.length);
        while(st.size()>0){
            ans[k++]=st.pop();
        }
        return ans;
    }
}