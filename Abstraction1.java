
import java.util.Scanner;

abstract class Shape{
  int l, b, s, r;
  abstract void rectangleArea(int l,int b);
  abstract void squareArea;
  abstract void circleArea(int r);
}

class Area extends Shape{
  @Override
  void rectangleArea(int l,int b){
    System.out.println(l*b);
  }
  @Override
  void squareArea(int l){
    System.out.println(s*s);
  }
  @Override
  void circleArea(int r){
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
    a.rectangleArea(a.l, a.b);
    a.squareArea(a.s);
    a.circleArea(a.r);
  }
}
