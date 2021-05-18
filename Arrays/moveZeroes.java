// Moving all the zeroes to the end
// Time complexity: O(n), Space Complexity: O(1)

import java.util.Arrays;
import java.util.Scanner;
public class moveZeroes {
    static void moveZero(int arr[], int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
        }}
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        moveZero(arr, n); 

        sc.close();
     }
}
