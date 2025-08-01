
class Main {
    public static void table (int number, int n ) {
        if (n == 0 ) return ;
        table(number, n-1);
        System.out.println(number +"x" + n + "=" + (number * n));
    }
    public static void main(String[] args) {
        table (5, 10);

        }
    }
