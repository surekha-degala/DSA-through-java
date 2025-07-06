class Solution {
    public static void main (String [] args) {
  Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
  solve(n);
}
public static void solve(int n ) {
  int sum = 0 ;
  for (int i =0; i<n;i++) {
  sum +=i;
}
System.out.println(sum);
}
}
