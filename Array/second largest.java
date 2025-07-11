class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums == null || nums.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                second = largest;
                largest = nums[i];
            } else if (nums[i] > second && nums[i] != largest) {
                second = nums[i];
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
