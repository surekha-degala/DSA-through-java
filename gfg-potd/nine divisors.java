class Solution {
    public  int countNumbers(int n) {
        // code here
        int count =0; 
        for (int i =0; i<=n;i++) {
            if (countdivisors(i) == 9) {
                count++;
            }
        }
        
        return count;
    }
    
    private int countdivisors(int num) {
        int count = 0;
        for (int i =1; i<=Math.sqrt(num); i++) {
            if (num %i ==0) {
                if (num / i == i) {
                    count++;
                } else {
                    count +=2;
                }
            }
            
        }
        return count;
    }
}

optimized 

    import java.util.*;

class Solution {
    public static int countNumbers(int n) {
        int count = 0;
        List<Integer> primes = sieve((int)Math.sqrt(n) + 1);

        // Case 1: Numbers of the form p^8
        for (int p : primes) {
            long pow = (long)Math.pow(p, 8);
            if (pow <= n) {
                count++;
            }
        }

        // Case 2: Numbers of the form p^2 * q^2
        int size = primes.size();
        for (int i = 0; i < size; i++) {
            long p2 = (long)primes.get(i) * primes.get(i);
            if (p2 > n) break;

            for (int j = i + 1; j < size; j++) {
                long q2 = (long)primes.get(j) * primes.get(j);
                if (p2 * q2 <= n) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

    // Sieve of Eratosthenes to get all primes up to √n
    private static List<Integer> sieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) primes.add(i);
        }

        return primes;
    }
}

