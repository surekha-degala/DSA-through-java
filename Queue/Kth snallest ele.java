import java.util.PriorityQueue;

class Solution {
    public static int kthLargest(int[] arr, int k) {
        // Create a min-heap (smallest element at the top)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.add(num);

            // Keep only the k largest elements in the heap
            if (pq.size() > k) {
                pq.poll(); // removes the smallest
            }
        }

        // The root of the heap is the kth largest
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 9};
        int k = 3;
        System.out.println(kthLargest(arr, k));  // Output: 4
    }
}
