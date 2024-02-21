import java.util.Scanner;

class MultiplicationTableUsingRecursion{

  public static void mulTable(int n, int times){
    if(times > 0){
      mulTable(n, times-1);
      System.out.printf("%d * %d = %d\n", n, times, n * times);
    }
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n =  in.nextInt();
    mulTable(n, 10);
  }
}