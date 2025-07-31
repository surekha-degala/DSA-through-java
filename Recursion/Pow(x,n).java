class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        for (int i = 1; i<=n; i++) {
            result *= x;
        }
        return result;
    }
}
//optimized code 

class Solution {
    public double myPow(double x, int n) {
     if (n ==0 ) return 1;
    if (n<0) {
        if (n == Integer.MIN_VALUE) {
                return 1 / (x * myPow(x, -(n + 1)));
            }
        return 1 / myPow(x, -n);
    }

    double half = myPow(x, n/2);
        if (n%2 == 0 ) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
    }
