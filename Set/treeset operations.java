
import java.util.TreeSet;
class Solution {
    public static TreeSet<Integer> insert(int arr[]) {
        // Your code here
        // Treeset<Integer> s = new TreeSet<>();
        TreeSet<Integer> s = new TreeSet<>();
        for (int num: arr) {
            s.add(num);
        }
        return s;
    }

    public static void display(TreeSet<Integer> s) {

        for (int num : s) {
            System.out.print(num+" ");
        }
        // Your code here
    }

        
    public static void erase(TreeSet<Integer> s, int x) {
        // Your code here
        if ( s. remove(x)) {
            System.out.print("erased " + x);
        } else {
            System.out.print("not found");
        }
        // display(s);
        
        
    }
}
