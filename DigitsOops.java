
import java.util.Scanner;

class Count{
  int n;
  Count(int n){
    this.n = n;
  }
  int counter(int n){
    if(n <= 9) return 1;
    return 1+counter(n/10);
  }
}

class DigitsOops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n =  in.nextInt();
    Count obj = new Count(n);
    System.out.println("Count of all digits: "+obj.counter(n));
  }
}