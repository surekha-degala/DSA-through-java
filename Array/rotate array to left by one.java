class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        if (n == 0) return;

        int temp = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;

        // Print the array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
