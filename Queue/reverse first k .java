class  ReverseK{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // code here.
        if ( q.size()<k || k<=0) {
            return q;
        }
        Deque<Integer> st = new ArrayDeque<>();
        for ( int i = 0;i <k ;i++) {
            
            st.push(q.poll());
        }
        
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
        int n = q.size();
        for ( int i = 0 ; i< n-k; i++) {
            q.offer(q.poll());
        }
        
        return q;
    }
}
