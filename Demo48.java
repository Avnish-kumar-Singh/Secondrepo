import java.util.Scanner;

class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp=new int[m][n];
       for(int i=0;i<m;i++){
        dp[i][0]=1;
       }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
        }
       for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            dp[i][j]=dp[i-1][j]+dp[i][j-1];
        }
       }
       return dp[m-1][n-1];
    }
}
public class Demo48{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m=sc.nextInt();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        Solution sol=new Solution();
        System.out.println("The number of unique path are "+sol.uniquePaths(m, n));
        sc.close();
    }
}