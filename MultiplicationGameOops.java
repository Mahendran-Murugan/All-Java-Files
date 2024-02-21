import java.util.Scanner;

class multiplicationGame{
  int fact(int n){
    if(n <= 1) return 1;
    return n*fact(n-1);
  }
  int calc(int st, int n, int p){
    while(fact(st) <= n){
      st++;
      p++;
    }
    return p;
  }
}
class MultiplicationGameOops{
  public static void main(String[] args){
    multiplicationGame ob = new multiplicationGame();
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    String s = "John";
    if(ob.calc(1, n, 1) %2 == 0) s = "Michael";
    System.out.print(n+" "+s+" wins");
  }
}