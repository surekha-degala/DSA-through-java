class Solution {
    public boolean searchKey(ListNode head, int key) {
        // Your code goes here
        ListNode temp = head;
        while(temp != null ) { 
            if (temp.val == key)  {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
