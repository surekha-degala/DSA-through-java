import java.util.*;

class Solution {
    public int minSoldiers(int[] arr, int k) {
        int n = arr.length;
        int luckyCount = 0;
        List<Integer> neededList = new ArrayList<>();

        // Step 1: Count already lucky troops & prepare needed list
        for (int num : arr) {
            if (num % k == 0) {
                luckyCount++;
            } else {
                int                                                                                                                                                                                   aremainder = num % k;
                int needed = (k - remainder) % k;
                neededList.add(needed);
            }
        }

        // Step 2: If already enough lucky troops
        int required = (n + 1) / 2; // ceil(n/2)
        if (luckyCount >= required) {
            return 0;
        }

        // Step 3: Sort by cheapest upgrade first
        Collections.sort(neededList);

        // Step 4: Add soldiers for smallest needed values
        int soldiersAdded = 0;
        int troopsToUpgrade = required - luckyCount;
        for (int i = 0; i < troopsToUpgrade; i++) {
            soldiersAdded += neededList.get(i);
        }

        return soldiersAdded;
    }
}
