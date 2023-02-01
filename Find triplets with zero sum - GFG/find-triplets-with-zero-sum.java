//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        // for(int i=0;i<n;i++){
        //     HashSet<Integer> set=new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         int rem= -(arr[i]+arr[j]);
        //         if(set.contains(rem)){
        //             return true;
        //         }else{
        //             set.add(arr[j]);
        //         }
        //     }
        // }
        // return false;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int low=i+1;
            int high=n-1;
            int curr=arr[i];
            while(low<high){
                if(curr+arr[low]+arr[high]==0){
                    return true;
                }else if(curr+arr[low]+arr[high]<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return false;
    }
}