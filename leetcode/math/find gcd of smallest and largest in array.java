class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = 0;
        int gcd = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);

        }
        for (int i = 1; i<=max; i++) {
            if( min %i == 0 && max%i ==0) {
                gcd = Math.max(gcd,i);
            }
        }
            return gcd;
    }
}
