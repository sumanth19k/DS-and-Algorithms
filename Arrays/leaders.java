// program to find the leaders in an array. The leaders in array are those elemets whose valiues to their rioht are lesser
// Time complexity: O(n), Space Complexity: O(1)
// prints it in reverse, you can maintain an ArrayList to reverse the elements returned.

import java.util.Scanner;
public class leaders {
    static void leadersArr(int arr[], int n){
        int lead=arr[n-1];
        System.out.print(lead+" ");
        for(int i=n-2;i>=0;i--){
            if(lead<arr[i]){
                lead=arr[i];
                System.out.print(lead+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        leadersArr(arr, n); 

        sc.close();
     }
}    

