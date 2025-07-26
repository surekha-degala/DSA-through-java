Node insertK(Node head, int ele, int k ) {
  if (head == null) {
    if (k==1) {
      return newNode(ele);
    } else {
      return head;
    }
    
  }

  if (k==1) {
    Node newNode = new Node (ele, head);
    return;
  }

  int count = 0;
  Node temp = head;
  while (temp != null)  {
    count++;
    if (count == (k-1)) {
      Node x = new Node (ele, temp.next);
      temp.next = x;
      break;
    }
    temp = temp.next;
    return head;
  }
}
