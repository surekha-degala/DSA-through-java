class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        char [] chars = columnTitle.toCharArray();
        for (char ch : chars) {
            result = result *26 +( ch - 'A'+1);
        }
        return result;
    }
}
