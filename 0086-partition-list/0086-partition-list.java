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
    public ListNode partition(ListNode head, int x) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);
        ListNode ans = first;
        ListNode firstPtr = first;
        ListNode secondPtr = second;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                firstPtr.next = temp;
                firstPtr = firstPtr.next;
            }else{
                secondPtr.next = temp;
                secondPtr = secondPtr.next;
            }
            temp = temp.next;
        }
        firstPtr.next = second.next;
        secondPtr.next = null;
        return first.next;
    }
}