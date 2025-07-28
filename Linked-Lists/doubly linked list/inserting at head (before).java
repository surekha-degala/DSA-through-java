class Solution {
    public ListNode insertBeforeHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X, head, null);
        
        if (head != null) {
            head.prev = newNode;
        }
        
        return newNode; // because newNode is now the actual head
    }
}
