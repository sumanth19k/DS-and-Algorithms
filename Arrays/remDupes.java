// Program to remove duplicates from an array, we take the input as a sorted array
// Instead of making another loop for sorting we shall use Arrays library
// Time complexity: O(n), Space Complexity: O(1)

import java.util.*;
public class remDupes {
    static void removeDupes(int arr[], int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        for(int i=0;i<res;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        removeDupes(arr, n); 

        sc.close();
     }    
}
