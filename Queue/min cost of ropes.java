class Solution {
    public static int minCost(int[] arr) {
        // code here
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for ( int nums : arr) {
          pq.offer(nums);
      }
          int tc = 0;
          while (pq.size()>1 ) {
          int first = pq.poll();
          int sec = pq.poll();
          int cost = first + sec;
          tc += cost;
          pq.offer(cost);
      }
      return tc;
    
}
}
