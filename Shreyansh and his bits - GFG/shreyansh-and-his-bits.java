//{ Driver Code Starts
//Initial Template for Java

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
            String input_line[] = read.readLine().trim().split("\\s+");
            long  N = Long.parseLong(input_line[0]);
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
    //long ans=0;
    long count(long n)
    {
        // Code Here
        
        int nb=csb(n);
        return solution(n, nb, 63);
    }
    public static long solution(long n, int k, int i){
        if(i==0){
            return 0;
        }
        
        long mask=1L<<i;
        long res=0;
        
        if((n&mask)==0){
            res=solution(n, k, i-1);
        }else{
            long res1=solution(n, k-1, i-1);
            long res0=ncr(i, k);
            res=res1+res0;
        }
        return res;
    }
    public static int csb(long n){
        int count=0;
        
        while(n>0){
            long rsb = n&-n;
            n -= rsb;
            count++;
        }
        return count;
    }
    public static long ncr(long n, long r){
        if(n<r){
            return 0L;
        }
        long res=1L;
        for(long i=0L;i<r;i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}