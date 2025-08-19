class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0, numsub = 0;
        for (int num: nums) {
            if(num == 0) numsub++;
            else
            numsub = 0;
            ans += numsub;

        }
        return ans;
    }
}
