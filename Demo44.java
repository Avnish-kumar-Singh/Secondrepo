import java.util.Scanner;

class Solution {
    public int[][] generateMatrix(int n) {
        int r1 = 0, r2 = n - 1;
        int c1 = 0, c2 = n - 1;

        int[][] arr = new int[n][n];
        int val = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) arr[r1][c] = val++;

            for (int r = r1 + 1; r <= r2; r++) arr[r][c2] = val++;

            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) arr[r2][c] = val++;

                for (int r = r2; r > r1; r--) arr[r][c1] = val++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return arr;
    }
}

public class Demo44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        Solution obj = new Solution();
        int[][] arr = obj.generateMatrix(n);

        // ✅ Corrected print format
        System.out.println("Generated Spiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " "); // Print in the same line
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close scanner to avoid memory leak
    }
}
