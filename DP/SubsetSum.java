package DP;
public class SubsetSum {
    static boolean isSubset(int arr[], int sum){
        int n = arr.length;
        boolean t[][] = new boolean[n+1][sum+1];
        int i,j;
        for(i=0;i<=n;i++) t[i][0]=true;
        for(j=1;j<=sum;j++) t[0][j]=false;
        
        for(i=1;i<=n;i++){
            for(j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][sum];
    }
    public static void main(String args[]) {
        int arr[] = new int[]{2,3,7,8,10};
        int sum=14;
        System.out.println(isSubset(arr, sum));
    }
}