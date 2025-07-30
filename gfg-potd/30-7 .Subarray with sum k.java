class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        int count = 0;
        for (int i = 0; i<n;i++) {
            int sum = 0;
            for (int j = i; j<n;j++) {
                sum += arr[j];
                if (sum ==k) {
                    count++;
                }
                
            }
        }
        return count;
    }
}
//optimized

import java.util.HashMap;

class Solution {
    public int cntSubarrays(int[] arr, int k) {
        int subarrayCount = 0;
        int currentSum = 0;

        HashMap<Integer, Integer> sumFrequency = new HashMap<>();
        sumFrequency.put(0, 1); // to count subarrays starting from index 0

        for (int num : arr) {
            currentSum += num;

            int neededSum = currentSum - k;

            if (sumFrequency.containsKey(neededSum)) {
                subarrayCount += sumFrequency.get(neededSum);
            }

            sumFrequency.put(currentSum, sumFrequency.getOrDefault(currentSum, 0) + 1);
        }

        return subarrayCount;
    }
}
