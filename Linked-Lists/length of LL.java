CLass Node {
  int data; 
  Node next;

Node (int data, int next) {
  this.data = data;
  this.next = next
}
  Node (int data) {
    this.data = data;
    this.next = null;
  }
}
private static int lll(Node head) {
  int count = 0;
  Node temp =  head;
  while (temp!= null) {
    count++;
    temp = temp.next;
  }
return count;
}
