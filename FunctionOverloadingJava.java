import java.util.Scanner;

class FunctionOverloadingJava{
  public void fun1(int a,int b,int c){
    System.out.println(a*b*c);
  } 
  public void fun1(int a,int b){
    System.out.println(a+b);
  }
  public static void main(String[] args){
    FunctionOverloadingJava m = new FunctionOverloadingJava();
    Scanner in = new Scanner(System.in);
    int n, n1, n2, n3;
    n = in.nextInt();
    n1 = in.nextInt();
    n2 = in.nextInt();
    if(n == 2) m.fun1(n1,n2);
    else{
      n3 = in.nextInt();
      m.fun1(n1,n2,n3);
    }
  }
}