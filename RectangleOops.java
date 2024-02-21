import java.util.Scanner;

class Rectangle{
  double width, height;
  
  double Area(){
    return width * height;
  }
  double Perimeter(){
    return 2 *(width + height);
  }
}
class RectangleOops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Rectangle[] p;
    p = new Rectangle[n];
    for(int i = 0; i < n; i++){
      p[i] = new Rectangle();
      p[i].width = in.nextDouble();
      p[i].height = in.nextDouble();
    }
    for(int i = 0; i < n; i++){
      System.out.println("---------------------------------");
      System.out.println("The area of the rectangle is "+ p[i].Area());
      System.out.println("The perimeter of the rectangle is "+ p[i].Perimeter());
    }
  }
}