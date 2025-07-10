class Solution {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        
        for (int i =0;i<n-1;i++ ) {
            int mini = i;
            for (int j =i+1; j<n; j++) {
                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }
        return nums;
    }
}
