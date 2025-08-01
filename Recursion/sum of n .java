class Solution {
    public int NnumbersSum(int N)  {
        if (N==0) {
            return 0;
        }
        return N + NnumbersSum(N-1);
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        Solution obj = new Solution ();
        System.out.println(obj.NnumbersSum(N));
    }
}

//


class Main {
    public static int sumi(int n ) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumi(n-1);
        return sum;
    }
    public static void main(String[] args) {
    int result = sumi(4);
    System.out.println(result);
        }
}
