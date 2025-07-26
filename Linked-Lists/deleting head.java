public int void removehead (Node head) {
  if (head == null) return head;
  Node temp = head;
  head = head.next;
  return head;
}


class Solution {
    public ListNode deleteHead(ListNode head) {
        if (head == null) return null;
        return head.next;
    }
}

//sleek one liner
return head == null ? null : head.next; 
