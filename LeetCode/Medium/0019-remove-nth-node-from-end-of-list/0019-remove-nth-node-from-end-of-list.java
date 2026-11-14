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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode cur = dummy;
        while(cur!=null){
            count++;
            cur = cur.next;
        }

        int k = count - n;

        cur = dummy;
        while(k>1){
            cur = cur.next;
            k--;
        }

        ListNode val = null;
        val = cur.next.next;
        cur.next = val;
        return dummy.next;
    }
}