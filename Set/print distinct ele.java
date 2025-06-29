import java.util.*;

public class GFG {
    static void printDist(int arr[]) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(!s.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                s.add(arr[i]);
            }
        }
    }

    public static void main(String[] argv) {
        int arr[] = {10, 8, 10, 10, 7};
        printDist(arr);
    }
}
