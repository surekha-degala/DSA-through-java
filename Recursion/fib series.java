
class Main {
    public static int fib (int n ) {
        if (n <= 1 ) return n;
        return  fib(n-1) + fib (n-2);
    }
    public static void main(String[] args) {
        int fibseries = 4;
        for (int i = 0; i<fibseries; i++) {
        System.out.print(fib(i));
        }
    }
}
