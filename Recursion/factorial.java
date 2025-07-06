public class Main {
public static int fact(int x){
  if (x ==0) return 1;
return x* fac(x-1)
}
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.println(fact(x));
}
}
  
