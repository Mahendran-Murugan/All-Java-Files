
import java.util.*;

class Circle{
  double rad;
  Circle(double rad){
    this.rad = rad;
  }
  void printResult(){
    System.out.printf("Radius of the circle is %.0f\n",rad);
    System.out.println("The area of the circle is "+(Math.PI*rad*rad));
    System.out.println("The circumference of the circle is "+(2*Math.PI*rad));
  }
}

class CircleOops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Circle[] c;
    c = new Circle[n];
    for(int i = 0; i < n; i++){
      double r = in.nextDouble();
      c[i] = new Circle(r);
    }
    for(int i = 0; i < n; i++){
      c[i].printResult();
    }
  }
}