//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        Set<Character> mapa=new HashSet<>();
        Set<Character> mapb=new HashSet<>();
        for(char ch: A.toCharArray()){
            mapa.add(ch);
        }
        for(char ch: B.toCharArray()){
            mapb.add(ch);
        }
        HashSet<Character> ans=new HashSet<>();
        for(char ch: A.toCharArray()){
            if(!mapb.contains(ch)){
                ans.add(ch);
            }
        }
        for(char ch: B.toCharArray()){
            if(!mapa.contains(ch)){
                ans.add(ch);
            }
        }
        List<Character> res=new ArrayList<>(ans);
        Collections.sort(res);
        
        String temp="";
        for(int i=0;i<res.size();i++){
            temp +=res.get(i);
        }
        return temp.length()==0?"-1":temp;
    }
}