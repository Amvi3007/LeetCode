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
        HashSet<ListNode> set = new HashSet<>();
        while(cur!=null){
            set.add(cur);
            cur = cur.next;
        }
        while(cur2!=null){
            if(set.contains(cur2)){
                return cur2;
            }
            cur2 = cur2.next;
        }
        return null;
    }
}