// User function Template for Java

class Solution {
    // arr[]: input array

    // Function to return the count of non-repeated elements in the array.
    static int countNonRepeated(int arr[]) {
        // add your code
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int num : arr) {
            fmap.put(num , fmap.getOrDefault(num , 0) +1);
        }
        int count =0; 
        for (int num : fmap.values() ) {
            if (num ==1) {
                count++;
            }
        }
        return count;
    }
}
