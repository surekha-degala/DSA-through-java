// User function Template for Java

class Solution {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        TreeSet<Integer> s = new TreeSet<>();
        for ( int num : arr) {
            s.add(num);
        }
        // System.out.println(s);
        return new ArrayList<>(s);
    }
}
