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
