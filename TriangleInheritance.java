
import java.util.Scanner;

abstract class Shape{
  double length, width, radius, s1, s2, s3;
  abstract public double Area();
  abstract public double Perimeter();
}

class Rectangle extends Shape{
  public void setLengthAndWidth(double l, double w){ length = l; width = w; }
  public double getLength(){ return length; }
  public double getWidth(){ return width; }
  public double Area(){
    return length*width;
  }
  public double Perimeter(){
    return 2*(length+width);
  }
}
class Square extends Shape{
  public double Area(){
    return s1*s1;
  }
  public double Perimeter(){
    return 4*s1;
  }
}
class Circle extends Shape{
  public double Area(){
    return Math.PI*radius*radius;
  }
  public double Perimeter(){
    return 2*Math.PI*radius;
  }
}
class Triangle extends Shape{
  public double Area(){
    return length*width*0.5;
  }
  public double Perimeter(){
    return s1+s2+s3;
  }
}

class TriangleInheritance{

  public static void printer(double a, double p){
    System.out.printf("Perimeter : %.2f\nArea : %.2f", p, a);
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    switch(ch){
      case 'S':
        Shape s = new Square();
        s.s1 = in.nextDouble();
        printer(s.Area(),s.Perimeter());
        break;
      case 'R':
        Shape r = new Rectangle();
        r.length = in.nextDouble();
        r.width = in.nextDouble();
        printer(r.Area(),r.Perimeter());
        break;
      case 'C':
        Shape c = new Circle();
        c.radius = in.nextDouble();
        printer(c.Area(),c.Perimeter());
        break;
      case 'T':
        Shape t = new Triangle();
        t.s1 = in.nextDouble();
        t.s2 = in.nextDouble();
        t.s3 = in.nextDouble();
        printer(t.Area(),t.Perimeter());
        break;
    }
  }
}