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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        
        ListNode slow = head, fast = head;
        // ListNode mid = slow;
        ListNode vslow = new ListNode(0);
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            vslow = slow;
            slow = slow.next;
            // mid.next = slow.next;
        }
        // ListNode temp = slow.next.next;
        // slow.next = slow.next.next;
        vslow.next = vslow.next.next;
        return head;
    }
}