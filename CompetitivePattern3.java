import java.util.Scanner;

class CompetitivePattern3{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = n; i >= 1; i--){
      for(int j = 1; j <= i; j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
}