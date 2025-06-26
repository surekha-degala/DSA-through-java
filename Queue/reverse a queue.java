lass GfG {
    // Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q) {
        // add code here.
        Deque<Integer> dq = new ArrayDeque<>();
        while (!q.isEmpty()) {
            dq.push(q.poll());
        }
        while (!dq.isEmpty()) {
            q.offer(dq.pop());
        }
        return q;
    }
}
