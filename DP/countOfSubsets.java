// The following code returns the count.
// The program is to return the count of subsets with given sum.
// Time complexity: O(n*sum), Space Complexity: O(n*sum),Type: 0/1 Knapsack

package DP;

public class countOfSubsets {
    static int countSub(int arr[], int sum){
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
        int arr[] = new int[]{2,3,7,8,10};
        int sum=12;
        System.out.println(countSub(arr, sum));
    }
}
