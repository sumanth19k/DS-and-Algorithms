// Program to reverse an array using an efficient method
//Time complexity: O(n/2), Space Complexity: O(1)

import java.util.*;
class reversed{
    static void reverse(int arr[], int n){
        int low=0, high=n-1;
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
        // for(int i=0;i<n;i++)
        // System.out.print(arr[i]+" ");
        // Instead of using a for loop to print the array use the Arrays library to print the array
        // The output looks good and also no extra run time needed.
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
       reverse(arr, n); 
    }
}