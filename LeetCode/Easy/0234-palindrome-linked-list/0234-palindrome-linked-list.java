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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newhead = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next = null;
        while(newhead!=null){
            next = newhead.next;
            newhead.next = prev;
            prev = newhead;
            newhead = next;
        }
        ListNode head2 = prev;
        while(head2!=null){
            if(head.val!=head2.val){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}