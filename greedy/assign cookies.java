class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        int gg = g.length;
        int ss = s.length;
        Arrays.sort(s);
        int l = 0, m = 0;

        while(l < gg && m < ss) {
            if (g[l] <= s[m]) {
                l++;
                m++;
            } else {
                m++;
            }
    
        }
        return l;
    }
}
