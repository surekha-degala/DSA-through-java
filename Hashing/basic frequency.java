import java.util.*;
public class Solution {
  public static void main (String [] args) {
    int n = sc.nextInt();
    int [] arr = new int [n];
    for (int i = 0 ; i<n; i++) {
      arr[i] = sc.nextInt();
    }
  }
  int [] hash = new hash[n];
  for (int i =0; i<n;i++) {
    hash[arr[i]] +=1;
}
int q  =sc.nextInt();
while (q--!=0) {
  int num = sc.nextInt();
  System.out.println(hash[num]);
}
}
}
