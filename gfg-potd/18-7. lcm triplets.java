class Solution {

    int lcmTriplets(int n) {

        // code here

        if(n<3) return n;

        if(n%2==1){

        return (n-1)*(n-2)*(n);        

        }

        if(n%2==0 && n%3==0){

            return (n-1)*(n-2)*(n-3);

        }

        return n*(n-1)*(n-3);

    }     

}

class Solution {

    // GCD helper
    long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // LCM helper
    long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    int lcmTriplets(int n) {
        long maxLCM = 0;

        // Try all combinations of (i, j, k)
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                for (int k = j; k >= 1; k--) {
                    long currentLCM = lcm(i, lcm(j, k));
                    if (currentLCM > maxLCM) {
                        maxLCM = currentLCM;
                    }
                }
            }
        }

        return (int) maxLCM;
    }
}


