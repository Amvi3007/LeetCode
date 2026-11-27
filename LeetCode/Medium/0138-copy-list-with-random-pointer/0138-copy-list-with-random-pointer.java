/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }

        Node cur1 = null;
        cur = head;
        while(cur!=null){
            cur1 = map.get(cur);
            cur1.next = map.get(cur.next);
            cur1.random = map.get(cur.random);

            cur = cur.next;
            cur1 = cur1.next;
        }

        return map.get(head);
        
    }
}