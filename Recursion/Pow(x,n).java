class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        for (int i = 1; i<=n; i++) {
            result *= x;
        }
        return result;
    }
}
