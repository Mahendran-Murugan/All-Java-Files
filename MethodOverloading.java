
import java.util.Scanner;

class Hello{
  void sayHello(){
    System.out.println("Hello");
  }
  void sayHello(String s){
    System.out.println("Hello "+s);
  }
}

class MethodOverloading{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String str = in.next();
    Hello s = new Hello();
    s.sayHello();
    s.sayHello(str);
  }
}