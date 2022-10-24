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
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int ans=-1;
        int maxZero=Integer.MIN_VALUE;
        for(int i=0;i<Mat.length;i++){
            int count=0;
            for(int j=0;j<Mat[0].length;j++){
                if(Mat[i][j]==1){
                    count++;
                }
            }
            if(maxZero<count){
                maxZero=count;
                ans=i;
            }
            
        }
        return ans;
    }
}