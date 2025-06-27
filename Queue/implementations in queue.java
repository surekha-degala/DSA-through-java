class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.offer(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {

        
        //  code here
        if(!dq.isEmpty()) {
            dq.pollLast();
        }
    }

        
    public static int front_dq(ArrayDeque<Integer> dq) {
        //  code here
        return dq.isEmpty() ? -1 : dq.peekFirst();
    }
        

    public static void pf(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.offerFirst(x);
    }
}
