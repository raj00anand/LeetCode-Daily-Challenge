//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int left[]=new int[n];
        int right[]=new int[n];
        int lfmax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lfmax){
                left[i]=arr[i];
                lfmax=arr[i];
            }else{
               left[i]=lfmax; 
            }
        }
        int rtmax=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>rtmax){
                right[i]=arr[i];
                rtmax=arr[i];
            }else{
                right[i]=rtmax;
            }
        }
        long area=0;
        for(int i=0;i<n;i++){
            int min=Math.min(right[i], left[i]);
            area += min-arr[i];
        }
        return area;
    } 
}


