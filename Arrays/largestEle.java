import java.util.Scanner;
class largestEle{
    public static void main(String[] args){
        int arr[] = new int[6];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<6;i++){
            arr[i] = sc.nextInt();
        }
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        System.out.println(arr[res]);

        sc.close();
    }
}