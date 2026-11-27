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
        if(n == 0)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int count = 0;
        while(cur.next!=null){
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