
import java.util.HashSet;
import java.util.Set;

class Solution {
  
    public int intersectionCount(int[] a, int[] b) {
        Set<Integer> s= new HashSet<>();
        for (int x : a) {
            s.add(x);
        }

        int count = 0;
        for (int y : b) {
            if (s.contains(y)) {
                count++;
            }
        }

        return count;
    }
}
