class Solution {
    int missingNum(int arr[]) {
        // code here+1
        int n = arr.length+1;
        int total = n * (n +1)/2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
        }
    }
