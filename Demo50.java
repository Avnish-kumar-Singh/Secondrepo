
import java.util.Scanner;

class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;

        int r=grid.length;
        int c=grid[0].length;

        int[][] dp=new int[r][c];
        dp[0][0]=grid[0][0];

        for(int j=1;j<c;j++){
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }

        for(int i=1;i<r;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
            }
        }
        return dp[r-1][c-1];
    }
}
public class Demo50{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m=sc.nextInt();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[][] grid=new int[m][n];
        System.out.println("Enter the grid elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        Solution sol=new Solution();
        System.out.println("The minimum path sum is:"+sol.minPathSum(grid));
        sc.close();

    }
}