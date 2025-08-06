import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // Empty prefix has sum 0
        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            // Check if there's a prefix subarray that sums to (sum - goal)
            count += map.getOrDefault(sum - goal, 0);

            // Store the current prefix sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
//sliding window

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left++];
            }

            count += (right - left + 1);
        }

        return count;
    }
}
