class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int max =0;
        int start = 0;
        int zeroes = 0;
        for (int end = 0; end<arr.length;end++) {
            if (arr[end]==0 ) {
                zeroes++;
            } while (zeroes > k) {
                if(arr[start]==0){
                    zeroes--;
                }
                start++;
            }
            max = Math.max(max, end-start +1);
        }
        return max;
    }
}
