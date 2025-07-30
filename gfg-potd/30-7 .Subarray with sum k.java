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
