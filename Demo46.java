import java.util.Scanner;

class Solution{
    public int matrixMultiplication(int arr[]){
            int n=arr.length;
            int[][] dp=new int[n][n];
            for(int i=2;i<n;i++){
                for(int j=1;j<n-i+1;j++){
                    int k=j+i-1;
                    dp[j][k]=Integer.MAX_VALUE;
                    for(int l=j;l<k;l++){
                        int cost=dp[j][l]+dp[l+1][k]+(arr[j-1]*arr[l]*arr[k]);
                        dp[j][k]=Math.min(dp[j][k], cost);
                    }
                }
            }
            return dp[1][n-1];
        }
}
public class Demo46{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of matrices:");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter the dimensions of the matrix:");
        for(int i=0;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        System.out.println("The minimum cost of matrix multiplication is:"+sol.matrixMultiplication(arr));
        sc.close();
    }
}