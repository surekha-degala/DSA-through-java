class Solution {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return pali(sb.toString(), 0);
    }

    public static boolean pali(String s , int i ) {
        int n = s.length();
        if (i >=n/2) return true;
        if (s.charAt(i) != s.charAt(n-i-1)) return false;
        return pali(s, i+1);

    }
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    } 
}
