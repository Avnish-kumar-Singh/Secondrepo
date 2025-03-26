import java.util.Scanner;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;

       int[][] dp = new int[m][n];
       dp[0][0]=1;

       for (int i = 0; i < m; i++) {  
         for (int j = 0; j < n; j++) {  

            if (obstacleGrid[i][j] == 1) {
               dp[i][j] = 0;  
            }else{
                if (i > 0) dp[i][j] += dp[i - 1][j];  
                if (j > 0) dp[i][j] += dp[i][j - 1];
             }
            }
        }
        return dp[m-1][n-1];
    }
}
public class Demo49{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the value of m:");
        int m=sc.nextInt();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[][] obstacleGrid=new int[m][n];
        System.out.println("Enter the elements of the grid:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                obstacleGrid[i][j]=sc.nextInt();
            }
        }
        Solution sol=new Solution();
        System.out.println("The number of unique paths is:"+sol.uniquePathsWithObstacles(obstacleGrid));
        sc.close();
        
    }
}