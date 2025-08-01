
class Main {
    public static boolean palindrome(String str, int start, int end) {
        if (start >= end ) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return palindrome (str, start+1, end-1);

    }
    public static void main(String[] args) {
        String s = "madam";
        if (palindrome(s, 0, s.length()-1)) {
        System.out.println(s + "is a palindrome");
        } else {
            System.out.println(s + "is not a palindrome");
        }
    }
}
