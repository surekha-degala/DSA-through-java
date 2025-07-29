/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode slow=head,fast=head;
    while(fast!=null &&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }    
    return slow;
    }
}







/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp= head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middlenode = (count/2) +1;
        ListNode newhead = head;
        int mc = 0;
        while ( newhead !=null ) {
            if (newhead == null || newhead.next == null) return newhead;
            mc++;
            if (mc == middlenode) {
                return newhead;
            }    
            newhead = newhead.next;        
        }

        return null;
    }
}
