public int void removehead (Node head) {
  if (head == null) return head;
  Node temp = head;
  head = head.next;
  return head;
}
