//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static class pair{
        int val;
        int idx;
        
        pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<pair> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<k;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        ans.add(new pair(max, index));
        for(int i=k;i<n;i++){
            pair maxp=ans.get(ans.size()-1);
            int nmax=maxp.val;
            int maxidx=maxp.idx;
            if(arr[i]>nmax){
                ans.add(new pair(arr[i], i));
            }else if(arr[i]<nmax && i-maxidx>=k){
                int maxv=Integer.MIN_VALUE;
                int maxvIdx=-1;
                for(int j=i-k+1;j<=i;j++){
                    if(maxv<arr[j]){
                        maxv=arr[j];
                        maxvIdx=j;
                    }
                    
                }
                ans.add(new pair(maxv,maxvIdx));
            }else{
                ans.add(maxp);
            }
            
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            res.add(ans.get(i).val);
        }
        return res;
    }
}