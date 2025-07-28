Node insertattail(Node head, int x) {
  if (head == null) reutrn newNode;
  Node tail = head;
  while(tail.next != null) {
    tail = tail.next;
  }
 Node prev = tail.back;
  Node newNode = new Node (x, tail, prev);
  prev.next = newNode;
  tail.back = newNode;

  return head;
}
