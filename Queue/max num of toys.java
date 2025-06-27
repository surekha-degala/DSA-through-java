// User function Template for Java

class Solution {
    public static int max_toys(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for ( int num : arr) {
            pq.add(num);
        }
        int count = 0 ;
        while ( !pq.isEmpty() && k>=pq.peek()) {
            k -= pq.poll();
            count++;
            
        }
        return count;
       
            }
        
    }
