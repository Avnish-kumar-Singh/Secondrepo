import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
       if(x<0) return 0;
       if(x==0 || x==1) return x;
       int low=1, high=x/2, floor=0;

       while(low<=high){
        int mid=low+(high-low)/2;
        long sqr=(long) mid*mid;
        if(sqr==x) return mid;
        else if(sqr<x){
            floor=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }
       }
       return floor;
    }
}
public class Demo53{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the square root of:");
        int x=sc.nextInt();
        Solution sol=new Solution();
        int ans=sol.mySqrt(x);
        System.out.println("The square root of "+x+" is:"+""+ans);
        sc.close();
    }
}