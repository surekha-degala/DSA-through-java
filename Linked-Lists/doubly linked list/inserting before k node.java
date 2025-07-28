Node temp = head;
int count =0;
while(temp != null ) {
  count++;
  if (count ==k) break;
  temp = temp.next;
}

if (temp == head) {
  Node newNode = new Node (x, head, null);
  head.prev = newNode;
  return newNode //edge case
}
Node prev = temp.back;
Node newNode = new Node (val, temp, prev);
temp.back = newNode;
prev.next = newNode;
return head;
}
