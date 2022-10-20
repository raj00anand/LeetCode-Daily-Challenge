//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int minStrIdx=-1;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            if(str.length()<minLen){
                minLen=str.length();
                minStrIdx=i;
            }
        }
        //String ans="";
        //System.out.println(minStrIdx);
        //System.out.println(minLen);
        for(int i=minLen-1;i>=0;i--){
            boolean flag=true;
            String temp=arr[minStrIdx].substring(0, i+1);
            //System.out.println(temp);
            for(String str: arr){
                if(str.startsWith(temp)==false){
                    flag=false;
                }
                
            }
            if(flag){
                return temp;
                
            }
            
        }
        return "-1";
    }
}