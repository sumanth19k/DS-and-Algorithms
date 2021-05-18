// program to find the frequency of elements in an array.
// Time complexity: O(n*n), Space complexity: O(1) 

import java.util.Scanner;
public class frequency {
    static void freq(int arr[], int n){
        int freq=1, i=1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+": "+freq);
            i++;
            freq=1;
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
       freq(arr, n);

       sc.close();
    }
}
