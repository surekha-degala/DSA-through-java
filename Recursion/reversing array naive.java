import java.util.Scanner;
class Solution {
  static void printArray (int[] ans, int n) {
  for (int i =0; i<n;i++) {
    System.out.print(ans[i] +" ");
    
  }
  }
    static void reverseArray(int [] arr, int n) {
      int ans [] = new int[n];
      for (int i = n-1; i>=0; i--) {
        ans[n-i-1] = arr[i];
      }
      printArray(ans, n);
    } 

  public static void main (String[] args ) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for (int i =0; i<n;i++){
      arr[i] = sc.nextInt();
    }
      reverseArray(arr, n);
    
  }
}
