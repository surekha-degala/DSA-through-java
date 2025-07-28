//here head will be not given and mostly they wont ask it to be head

Node inserNode (Node node, int val) {
  Node prev = node.back;
  Node newNode = new Node(val, node, prev);
  prev.next = newNode;
  node.back = newNode;
}
