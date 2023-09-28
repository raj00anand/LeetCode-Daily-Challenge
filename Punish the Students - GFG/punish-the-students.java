//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            double avg = sc.nextDouble ();
            int[] roll = new int[n];
            int[] marks = new int[n];
            
            for (int i = 0; i < n; ++i)
                roll[i] = sc.nextInt ();
                
            for (int i = 0; i < n; ++i)
                marks[i] = sc.nextInt ();

    		System.out.println (new Solution().shouldPunish (roll, marks, n, avg));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int ns = 0;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(roll[j]>roll[j+1]){
                    swap(roll, j, j+1);
                    ns++;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(roll[i]);
        // }
        int sum = 0;
        for(int val: marks){
            sum += val;
        }
        sum -= ns;
        if((sum/n)>avg){
            return 1;
        }else{
            return 0;
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}