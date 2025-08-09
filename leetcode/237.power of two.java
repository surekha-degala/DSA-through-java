class Solution {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        while (i<n){
            if (Math.pow(2, i) == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}// This will exceed time complexity.

class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i<=Math.sqrt(n)+1; i++) {
            if (Math.pow(2, i)== n) {
                return true;
            }
        }
        return false;
    }
}// this will be bruteforce and take 6 ms.

//here goes the optimal solution 

class Solution {
    public boolean isPowerOfTwo(int n) {
     if (n <= 0) return false;
        while (n %2 ==0) {
            n/=2;
        }
        return n == 1;
    }
}
//here goes the bit method
class Solution {
    public boolean isPowerOfTwo(int n) {
        if ( n <= 0) return false;
        return (n & n-1) ==0;
    }
}
