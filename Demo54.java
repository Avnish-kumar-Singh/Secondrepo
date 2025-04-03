import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        String[] arr =path.split("/");
        Stack<String> stack=new Stack<>();

        // for(String i:arr){
            // if(i.equals("..") && !stack.empty()){
                // stack.pop();
            // }else if(!i.equals("") && !i.equals(".") ){
                // stack.push(i);
            // }
        // }

        for (String i : arr) {
            if (i.equals("..")) {
                if (!stack.isEmpty()) { // Pop only if the stack is not empty
                    stack.pop();
                }
            } else if (!i.equals("") && !i.equals(".")) {
                stack.push(i); // Push valid directory names
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String i:stack){
            sb.append("/");
            sb.append(i);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}
public class Demo54{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path to simplify:");
        String path = sc.nextLine().trim();

        Solution sol=new Solution();
        String ans=sol.simplifyPath(path);
        System.out.println("The simplified path is:"+ans);
        sc.close();
    }
}