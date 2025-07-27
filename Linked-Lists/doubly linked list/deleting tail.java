
Node dekteTail(Node head) {
  Node tail = head;
  while(tail.next != null ) {
    tail = tail.next;
  }
  Node prev = tail.back;
  prev.next = null;
  tail.back = null;
return head;
}
