import java.util.Scanner;
class Solution {
  static void printArray(int [] arr, int n){
  for (int i =0; i<n;i++) {
  System.out.print(arr[i]+" ");
  }
  }

static void reverse(int [] arr, int n  ){
  int p1 =0; int p2 = n-1; 
  while (p1<p2){
  int temp = arr[p1];
  arr[p1]= arr[p2];
  arr[p2] = temp;
  p1++;
  p2--;
}
}
  public static void main (String [] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];
    for (int i =0; i<n;i++) {
      arr[i]= sc.nextInt();
    }
    reverse(arr, n);
      printArray(arr, n);


  }
}
