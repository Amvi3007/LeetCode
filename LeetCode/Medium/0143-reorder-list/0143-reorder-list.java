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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newnode = slow.next;
        slow.next = null;
        ListNode prev =  null;
        ListNode next = null;
        ListNode cur = newnode;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode newhead = prev;
        ListNode cur1 = head;
        ListNode cur2 = newhead;
        
        while(cur1!=null && cur2!=null){
            ListNode next1 = cur1.next;
            ListNode next2 = cur2.next;

            cur1.next = cur2;
            cur2.next = next1;

            cur1 = next1;
            cur2 = next2;
        }
    }
}