import java.util.Scanner;
class Solution {
    public int fib(int n) {
        if (n <=1) return n;
        int first = fib(n-1);
        int last = fib(n-2);
        return first + last;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        Solution sol = new Solution ();
        System.out.println(sol.fib(n));
    }
}
