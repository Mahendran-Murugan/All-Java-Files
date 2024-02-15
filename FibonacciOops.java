import java.util.Scanner;

class Fibo{
  void Fibonacci(int n){
    int prev1 = 1, prev2 = 1, current = 0;
    while(current < n){
      current = prev1 + prev2;
      prev1 = prev2;
      prev2 = current;
      if(current <= n){
        System.out.println((int)Math.ceil(current)+" is a fibonacci number ");
        powerOfTwo(current);
      }
    }
  }
  void powerOfTwo(int n){
    int res=1;
    while(res <= n){
      res*=2;
      if(res == n){
        System.out.println((int)Math.floor(n)+" is a power of two");
        return;
      }
    }
  }
}

class FibonacciOops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Fibo f = new Fibo();
    f.Fibonacci(n);
  }
}