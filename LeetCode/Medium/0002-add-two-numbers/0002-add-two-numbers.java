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
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode dummy = new ListNode(0);
        int sum = cur1.val + cur2.val;
        int carry = sum/10;
        sum = sum%10;
        ListNode cur = null;
        cur = new ListNode(sum);
        dummy.next = cur;
        cur1 = cur1.next;
        cur2 = cur2.next;
        while(cur1!=null || cur2!=null || carry>0){
            sum = carry;
            if(cur1!=null){
                sum+=cur1.val;
                cur1 = cur1.next;
            }

            if(cur2!=null){
                sum+=cur2.val;
                cur2 = cur2.next;
            }

            carry = sum/10;
            sum = sum%10;
            cur.next = new ListNode(sum);
            cur = cur.next;
        }
        return dummy.next;
    }
}