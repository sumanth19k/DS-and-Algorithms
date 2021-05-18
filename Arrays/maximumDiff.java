// program to find the maximum difference in an array.
// IP: [1,2,3,7,4] OP: 6 (7-1)
// Time complexity: O(n), Space complexity: O(1) 

import java.util.Scanner;
public class maximumDiff {
    static int maxDiff(int arr[], int n){
        int res=arr[1]-arr[0];
        int minVal=arr[0];
        for(int i=1;i<n;i++){
            res=Math.max(res, arr[i]-minVal);
            minVal=Math.min(minVal, arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
       System.out.print(maxDiff(arr, n)); 

       sc.close();
    }
}
