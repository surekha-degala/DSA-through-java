class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() <3) return 0;
        int count = 0;
        int left = 0; 
        for (int right =2 ; right <s.length(); right++) {
            char a = s.charAt(left);
            char b = s.charAt(left+1);
            char c = s.charAt(right);

            if (a != b && b!= c && c!= a) {
                count++;
            }
            left++;
        }
        return count;
    }
}
