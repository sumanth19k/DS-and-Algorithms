import java.util.Scanner;


public class secondEle {
    static int secondLargest(int arr[], int n){
        int i,res=-1, longest=0;
        for(i=1;i<n;i++){
            if(arr[i]>arr[longest]){
                res=longest;
                longest=i;
            }
            else if(arr[i]!=arr[longest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            sc.nextInt();
        }
        
        System.out.println(secondLargest(arr, n)); 
    }
}
