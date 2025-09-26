import java.util.HashSet;

public class FirstRepeating {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                 
                System.out.println("First repeating element: " + arr[i] + 
                                   ", index: " + i);
                break;  
            }
            set.add(arr[i]);
        }
    }
}
