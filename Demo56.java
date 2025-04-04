
import java.util.Scanner;

class Solution {
    public void setZeroes(int[][] matrix) {

        if(matrix==null || matrix.length==0) return;
        
        int rows=matrix.length;
        int cols=matrix[0].length;

        boolean rowZero=false;
        boolean colZero=false;

        for(int j=0;j<cols;j++){
            if(matrix[0][j]==0){
                rowZero=true;
                break;
            }
        }

        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                colZero=true;
                break;
            }
        }

        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(rowZero){
            for(int j=0;j<cols;j++){
                matrix[0][j]=0;
            }
        }

        if(colZero){
            for(int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
        }
    }
}
public class Demo56{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the numbers of columns:");
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Solution sol=new Solution();
        sol.setZeroes(matrix);
        System.out.println("The matrix after setting zeroes is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(""+matrix[i][j]+"");

            }
            System.out.println();
        }
        sc.close();

    }
}