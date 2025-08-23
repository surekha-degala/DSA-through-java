class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int mis = 0;
        int sumofn = (n*(n+1))/2;
        
        for (int i = 0; i<n;i++) {
           
            sum += nums[i];
        }
        mis = sumofn - sum;
        return mis;
    }
}
