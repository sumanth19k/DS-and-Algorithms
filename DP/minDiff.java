// The program is to return the minimum subset sum difference in the given array.
// Time complexity: O(n*sum), Space Complexity: O(n*sum),Type: 0/1 Knapsack

package DP;

public class minDiff {
    static int minDifference(int arr[], int sum){
        int n = arr.length;
        boolean t[][] = new boolean[n+1][sum+1];
        int i,j,diff=Integer.MAX_VALUE;
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
        
        for(i=sum/2;i>=0;i--){
            if(t[n][i]==true){
                diff = Math.min(diff, sum-2*i);
                break;
            }
        }
        
        return diff;
    }
    public static void main(String args[]) {
        int arr[] = new int[]{1,6,5,11};
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        System.out.println(minDifference(arr, sum));
    }
}
