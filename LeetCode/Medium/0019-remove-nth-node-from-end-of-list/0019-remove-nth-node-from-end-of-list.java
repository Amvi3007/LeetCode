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
        int count = 0;
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        dummy.next = cur;

        while(cur!=null){
            count++;
            cur = cur.next;
        }

        int k = count - n;
        cur = dummy;
        while(k>0){
            cur = cur.next;
            k--;
        }

        ListNode val = null;
        if(cur.next!=null){
            val = cur.next.next;
        }
        cur.next = val;

        return dummy.next;
    }
}