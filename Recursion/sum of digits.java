// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n%10 +sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int m = 123;
        int result = sumOfDigits(m);

        System.out.println(sumOfDigits(result));
    }
}
