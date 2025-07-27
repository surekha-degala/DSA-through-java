Node deletingk(Node head, int k ) {
  if (head == null) return null;
  Node temp = head;
  int count =0;
  while(temp != null) {
    count++;
    if (count == k )  break;
    temp = temp.next;
  }
  Node prev = temp.back;
  Node front = temp.next;

  if (prev == null && front == null ) return null;
  else if (prev == null) {
    deletehead(head);
}
  else  (front == null) {
  deletetali(head);
  }

  prev.next = front;
  front.back = prev;
  temp.next = null;
  temp.back = null;
}
return head;
}

Node deletingk(Node head, int k) {
    if (head == null) return null;

    Node temp = head;
    int count = 1;

    while (temp != null && count < k) {
        temp = temp.next;
        count++;
    }

    if (temp == null) return head; // k > length

    Node prev = temp.back;
    Node front = temp.next;

    // Case 1: Only one node
    if (prev == null && front == null) {
        return null;
    }
    // Case 2: Head node
    else if (prev == null) {
        head = deleteHead(head); // must update head
        return head;
    }
    // Case 3: Tail node
    else if (front == null) {
        head = deleteTail(head); // tail deletion
        return head;
    }

    // Case 4: Middle node
    prev.next = front;
    front.back = prev;

    // Clean up
    temp.next = null;
    temp.back = null;

    return head;
}
