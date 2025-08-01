// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int maxele(int [] arr, int n ) {
        if (n == arr.length - 1) {
            return arr[n];
        }
        int maxinarr = maxele(arr, n+1);
        return Math.max (arr[n], maxinarr);
        
    }
    public static void main(String[] args) {
    int arr [] = {1, 2, 3, 4, 3, };
    int maxi = maxele(arr, 0);
    System.out.println(maxi);
    }
}
