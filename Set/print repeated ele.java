import java.util.*;

public class GFG {
    static void printRepeating(int arr[]) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])) {
                System.out.print(arr[i] + " ");
            } else {
                s.add(arr[i]);
            }
        }
    }

    public static void main(String[] argv) {
        int arr[] = {10, 8, 10, 8};
        printRepeating(arr);
    }
}
