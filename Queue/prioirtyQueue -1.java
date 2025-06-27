class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for ( int num : arr) {
            pq.add(num);
        }
        return pq;
    }
}
