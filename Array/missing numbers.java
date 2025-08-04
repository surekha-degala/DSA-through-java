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
import java.util.*;
class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i = 1; i<=arr.length;i++) {
            if (i!= arr[i-1]) return i;
        }
        return arr.length+1;
    }
}
