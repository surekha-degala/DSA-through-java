// User function Template for Java
class Solution {
    public static String Sorted_Characters(String s) {
        // Your code here
        TreeSet<Character> se = new TreeSet<>();
        for (char c : s.toCharArray()) {
            se.add(c);
            
        }
       StringBuilder sb = new StringBuilder();
       for (char c : se) {
           sb.append(c);
       }
       
       return sb.toString();
    }
}
