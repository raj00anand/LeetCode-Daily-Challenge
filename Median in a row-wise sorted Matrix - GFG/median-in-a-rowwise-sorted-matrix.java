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
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0, j=C-1;i<R;i++){
            if(max<matrix[i][j]){
                max=matrix[i][j];
            }
        }
        for(int i=0, j=0;i<R;i++){
            if(min>matrix[i][j]){
                min=matrix[i][j];
            }
        }
        int desired=(R*C+1)/2;
        while(min<max){
            int mid=min+(max-min)/2;
            
            int place=0;
            int get=0;
            
            for(int i=0;i<R;i++){
                get=Arrays.binarySearch(matrix[i], mid);
                if(get<0){
                    get=Math.abs(get)-1;
                }else{
                    while(get<matrix[i].length && matrix[i][get]==mid){
                        get=get+1;
                    }
                }
                place=place+get;
            }
            if(place<desired){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
        
    }
}


/*class Solution {
    int median(int matrix[][], int R, int C) {
        // code here 
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0, j=0;i<R;i++){
            if(min>matrix[i][j]){
                min=matrix[i][j];
            }
        }
        for(int i=0,j=C-1;i<R;i++){
            if(max<matrix[i][j]){
                max=matrix[i][j];
            }
        }
        int desired=(R*C+1)/2;
        while(min<max){
            int mid=min+(max-min)/2;
            
            int place=0;
            int get=0;
            
            for(int i=0;i<R;i++){
                get=Arrays.binarySearch(matrix[i], mid);
                if(get<0){
                    get=Math.abs(get)-1;
                }else{
                    while(get<matrix[i].length && matrix[i][get]==mid){
                        get=get+1;
                    }
                }
                place=place+get;
                
                
            }
            if(place<desired){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
        
    }
}*/