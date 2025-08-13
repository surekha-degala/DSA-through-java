
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n = n /3;
        }
        return n == 1;
    }
}
class Solution {
    public boolean isPowerOfThree(int n ) {
        if ( n <=0) return false;
        for (int i =0; i<Math.sqrt(n);i++) {
            if (Math.pow(i, 3) == n) {
                return true;
            }
        }
    return false;
    }
}
