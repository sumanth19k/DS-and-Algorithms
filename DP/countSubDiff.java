package DP;

public class countSubDiff {
    static int countDiff(int arr[], int sum){
        int n = arr.length;
        int t[][] = new int[n+1][sum+1];
        int i,j;
        for(i=0;i<=n;i++) t[i][0]=1;
        for(j=1;j<=sum;j++) t[0][j]=0;
        
        for(i=1;i<=n;i++){
            for(j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        
        return t[n][sum];
    }
    public static void main(String args[]) {
        int arr[] = new int[]{1,1,2,3};
        int sum=0, diff=1;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        int d = (sum+diff)/2;
        System.out.println(countDiff(arr, d));
    }
}
