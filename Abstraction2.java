
import java.util.Scanner;

abstract class Marks{
  int marks1, marks2, marks3, marks4; 
  abstract void getPercentage(); 
}

class A extends Marks{
  A(int m1, int m2, int m3){
    this.marks1 = m1;
    this.marks2 = m2;
    this.marks3 = m3;
  }
  void getPercentage(){
    System.out.printf("%.2f\n",((double)marks1+(double)marks2+(double)marks3)/3);
  }
}

class B extends Marks{
  B(int m1, int m2, int m3, int m4){
    this.marks1 = m1;
    this.marks2 = m2;
    this.marks3 = m3;
    this.marks4 = m4;
  }
  void getPercentage(){
    System.out.printf("%.2f\n",((double)marks1+(double)marks2+(double)marks3+(double)marks4)/4);
  }
}

class Abstraction2{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int m1, m2, m3, m4;
    m1 = in.nextInt();
    m2 = in.nextInt();
    m3 = in.nextInt();
    A a = new A(m1,m2,m3);
    m1 = in.nextInt();
    m2 = in.nextInt();
    m3 = in.nextInt();
    m4 = in.nextInt();
    B b = new B(m1,m2,m3,m4);
    a.getPercentage();
    b.getPercentage();
  }
}