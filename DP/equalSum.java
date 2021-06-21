// The following code returns a binary output true/false
// The program is to check whether if the array can be divided into two parts with equal sum.
// Time complexity: O(n*sum), Space Complexity: O(n*sum),Type: 0/1 Knapsack

package DP;

public class equalSum {
    static boolean canPartition(int arr[], int n){
        int i,j,sum=0;
        for(i=0;i<n;i++) sum+=arr[i];
        boolean t[][] = new boolean[n+1][sum/2+1];
        for(i=0;i<=n;i++) t[i][0]=true;
        for(j=1;j<=sum/2;j++) t[0][j]=false;
        
        if(sum%2!=0) return false;
        
        for(i=1;i<=n;i++){
            for(j=1;j<=sum/2;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][sum/2];
    }
    public static void main(String args[]) {
        int arr[] = new int[]{2,3,7,8,6};
        int n=5;
        System.out.println(canPartition(arr, n));
    }
}

