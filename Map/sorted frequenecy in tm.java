//Back-end complete function Template for Java

class Solution {
    public static void freqSorted(int arr[]) {
        // Your Code Here
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int num : arr) {
            tm.put(num , tm.getOrDefault(num , 0)+1);
        }
        for (Map.Entry<Integer, Integer> e : tm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
