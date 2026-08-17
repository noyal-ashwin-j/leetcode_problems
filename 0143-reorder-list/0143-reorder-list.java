class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }  
        ListNode second = slow.next;
        slow.next = null;
        
        ListNode prev = null;     
        while(second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        second = prev;  
        ListNode first = head; 
        while(second != null) {
            ListNode temp = first.next;
            ListNode temp1 = second.next;         
            first.next = second;
            second.next = temp;           
            first = temp;
            second = temp1;
        }
    }
}