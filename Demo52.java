import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
            digits = new int [n+1];
            digits[0]=1;
            return digits;

        }
    
}
public class Demo52{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits in the array");
        int n=sc.nextInt();
        int [] digits=new int[n];
        System.out.println("Enter the digits of the array:");
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        int [] ans=sol.plusOne(digits);
        System.out.println("The new array is:");
        for(int i=0;i<ans.length;i++){
            System.out.println(""+ans[i]);
        }
        sc.close();

    }
}