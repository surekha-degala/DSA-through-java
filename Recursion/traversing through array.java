// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void printArray(int [] arr, int n) {
        if (n == arr.length) {
            return;
        }
       System.out.println(arr[n] +" ");
       printArray(arr, n+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArray(arr, 0);
       
        }
    }
