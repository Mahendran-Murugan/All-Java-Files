
import java.util.Scanner;

class Vehicle{
  Scanner in = new Scanner(System.in);
  void move(){
    String str = in.nextLine();
    System.out.println(str);
  }
}

class Motorbike extends Vehicle{
  void move(){
    String str = in.nextLine();
    super.move();
    System.out.println(str);
  }
}

class DynamicPolymorphism{
  public static void main(String[] args){
    Motorbike m = new Motorbike();
    m.move();
  }
}