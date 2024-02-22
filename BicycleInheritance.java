
import java.util.Scanner;

class Bicycle{
  int gears, speed;
  Bicycle(int g, int s){
    gears = g;
    speed = s;
  }
}

class MountainBike extends Bicycle{
  int seat;
  MountainBike(int g, int s, int sh){
    super(g, s);
    seat = sh;
  }
  public String toString(){
    return "No of gears are "+gears+"\n "+"speed of bicycle is "+speed+"\n"+"seat height is "+seat;
  }
}

class BicycleInheritance{
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    int s, sh, g;
    g = in.nextInt();
    s = in.nextInt();
    sh = in.nextInt();
    MountainBike m = new MountainBike(g, s, sh);
    System.out.println(m);
  }
}