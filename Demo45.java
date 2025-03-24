import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
       List<Integer> m=new ArrayList<>();
       int fact=1;

       for(int i=1;i<=n;i++){
           m.add(i);
           if(i<n) fact*=i;
       }
       StringBuilder ans=new StringBuilder();
       k--;
       for(int i=n-1;i>=0;i--){
           int index=k/fact;
           ans.append(m.get(index));
           m.remove(index);
           k%=fact;
           if(i>0){
               fact/=i;
           }
       }
       return ans.toString();
   }
}
public class Demo45{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        Solution sol=new Solution();
        System.out.println("The "+k+"th permutation of "+n+" is:"+sol.getPermutation(n, k));
        sc.close();
    }
}