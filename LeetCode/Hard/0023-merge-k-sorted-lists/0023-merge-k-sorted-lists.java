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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<lists.length;i++){
            ListNode x = lists[i];
            while(x!=null){
                    pq.add(x.val);
                    x = x.next;
            }
        }

        ListNode res = new ListNode();
        if(!pq.isEmpty()){
            res = new ListNode(pq.poll());
            ListNode tail = res;
            while(!pq.isEmpty()){
                tail.next = new ListNode(pq.poll());
                tail = tail.next;
            }
        }else{
            return null;
        }
        

        return res;
    }
}