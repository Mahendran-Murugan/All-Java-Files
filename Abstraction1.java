
import java.util.Scanner;

abstract class Shape{
  int l, b, s, r;
  abstract void rectangleArea(); 
  abstract void squareArea(); 
  abstract void circleArea(); 
}

class Area extends Shape{
  @Override
  void rectangleArea(){
    System.out.println(l*b);
  }
  @Override
  void squareArea(){
    System.out.println(s*s);
  }
  @Override
  void circleArea(){
    System.out.printf("%.2f\n",(Math.PI*(double)r*(double)r));
  }
}

public class Abstraction1{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Area a = new Area();
    a.l = in.nextInt();
    a.b = in.nextInt();
    a.s = in.nextInt();
    a.r = in.nextInt();
    a.rectangleArea();
    a.squareArea();
    a.circleArea();
  }
}
