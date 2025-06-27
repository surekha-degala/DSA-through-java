
class Solution {
    // Function to insert all elements of the array in deque.
    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
        // Your code here
        ArrayDeque <Integer> dq = new ArrayDeque<>();
        for ( int num : arr) {
            dq.add(num);
        }
        return dq;
        
        
    }
}
