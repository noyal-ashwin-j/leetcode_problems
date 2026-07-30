/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=l1;
        ListNode temp1=l2;
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;

        int carry=0;
        while(temp!=null || temp1!=null || carry!=0){
            int sum=0;
            sum+=carry;
            if(temp!=null){
            sum+=temp.val;
             temp=temp.next;}
            if(temp1!=null){
                sum+=temp1.val;
                  temp1=temp1.next;
            }
            carry=sum/10;
            head.next=new ListNode(sum%10);
        
            head=head.next;
        }
        return dummy.next;
    }
}