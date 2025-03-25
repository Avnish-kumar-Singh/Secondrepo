import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}
class Solution{
    public ListNode rotateRight(ListNode head, int k){
        if(head==null || head.next==null || k==0) return head;
            ListNode temp=head;
            int len=1;
            while(temp.next!=null){
                temp=temp.next;
                len++;
            }
            temp.next=head;

            k=k%len;

            int h=len-k;
            temp=head;
            for(int i=1;i<h;i++){
                temp=temp.next;
            }
            ListNode newHead=temp.next;
            temp.next=null;
            
        
        return newHead;
    }
}
public class Demo47{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the linkedList:");
        int n=sc.nextInt();

        if (n == 0) {
            System.out.println("Empty linked list!");
            sc.close();
            return;
        }

        System.out.println("Enter the elements:");
        ListNode head=new ListNode(sc.nextInt());
        ListNode temp=head;
        for(int i=1;i<n;i++){
            temp.next=new ListNode(sc.nextInt());
            temp=temp.next;
        }

        System.out.println("Enter the value of k:");
        int k=sc.nextInt();

        Solution sol=new Solution();
        ListNode newHead=sol.rotateRight(head, k);

        System.out.println("Rotated linedList is:");
        while(newHead!=null){
            System.out.println(newHead.val);
           // if (newHead.next != null) {
             //   System.out.print(" -> ");
            //}
            newHead=newHead.next;
        }
       // System.out.println();
        sc.close();
    }
}