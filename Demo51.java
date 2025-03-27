
import java.util.Scanner;

class Solution {
    public boolean isNumber(String s) {
        //String trimmedString=s.trim();
        s=s.trim();
        if(s.isEmpty()) return false;
        boolean Digit=false;
        boolean Decml=false;
        boolean Expp=false;
        int i=0;
        int n=s.length();
        // while(i<n){
        //      char ch=s.charAt(i);
        for( i=0;i<n;i++){
            char ch=s.charAt(i);
        
            if(Character.isDigit(ch)){
                Digit=true;
            }else if(ch=='.'){
                if(Decml || Expp){
                    return false;
                }
                Decml=true;
            }else if(ch=='e' || ch=='E'){
                if(Expp || !Digit){
                    return false;
                }
                Expp=true;
                Digit=false;
            }else if(ch=='+' || ch=='-'){
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E'){
                    return false;
                }
            }else{
                return false;
            }
        }
        return Digit;
    }
}
public class Demo51{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        Solution sol=new Solution();
        System.out.println("Is the string a number:"+sol.isNumber(s));
        sc.close();
    }
}