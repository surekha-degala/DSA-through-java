import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Frequency map for array a
        HashMap<Integer, Integer> freqA = new HashMap<>();
        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        // Result list
        ArrayList<Integer> result = new ArrayList<>();

        // Go through array b and find common elements
        for (int num : b) {
            if (freqA.containsKey(num) && freqA.get(num) > 0) {
                result.add(num);
                freqA.put(num, freqA.get(num) - 1); // Decrease count in freq map
            }
        }
        Collections.sort(result);

        return result;
    }
}
