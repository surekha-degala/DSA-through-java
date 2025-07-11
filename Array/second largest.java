class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int s  = Integer.MIN_VALUE;
        for(int i =0; i<nums.length;i++) {
            if (nums[i]> largest) {
                largest = nums[i];
            } else if (nums[i]> s && s != largest) {
                s = nums[i];
            }
        }
        return s;
    }
}
