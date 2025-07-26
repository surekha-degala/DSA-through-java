Node insertTail(Node value, Node head) {
  if (head == null) {
    return new Node(val);
  }
  Node temp = head;
  while(temp.next != null) {
    temp = temp.next;
  }
  Node newNode = new Node(val);
  temp.next = newNode;
  return head;
}
}
