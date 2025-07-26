Node removeTail (Node head) {
  if (head == null || head.next == null) return null;
  node temp = head;
  while (temp.next.next != null) {
    temp= temp.next;
  }
  temp.next = null;
  return head;
}
