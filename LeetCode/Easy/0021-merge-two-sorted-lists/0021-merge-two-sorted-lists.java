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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode demo = new ListNode(0);
        ListNode cur1  = list1;
        ListNode cur2 = list2;
        ListNode cur = demo;
        while(cur1!=null && cur2!=null){
            if(cur1.val>=cur2.val){
                cur.next = cur2;
                cur2 = cur2.next;
                cur = cur.next;
            }
            else{
                cur.next = cur1;
                cur1 = cur1.next;
                cur = cur.next;
            }
        }

        if(cur1 == null){
            cur.next = cur2;
        }else{
            cur.next = cur1;
        }

        return demo.next;
    }
}