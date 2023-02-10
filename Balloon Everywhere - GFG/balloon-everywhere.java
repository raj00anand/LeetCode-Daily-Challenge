//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        int freq[]=new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        char character[]={'b', 'a', 'l', 'o', 'n'};
        int max=Integer.MAX_VALUE;
        for(char ch: character){
            if(ch=='l' || ch=='o'){
                int cmax = freq[ch-'a'];
                max=Math.min(max, cmax/2);
            }else{
                max=Math.min(max, freq[ch-'a']);
            }
        }
        return max;
    }
}