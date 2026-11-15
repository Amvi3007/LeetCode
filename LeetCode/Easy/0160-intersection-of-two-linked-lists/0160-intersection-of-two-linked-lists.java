/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur = headA;
        ListNode cur2 = headB;
        while(cur!=null){
            cur2 = headB;
            while(cur2!=null){
                if(cur2 == cur){
                    return cur2;
                }
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        return null;
    }
}