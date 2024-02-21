import java.util.Scanner;

class CompetitivePattern5{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i= 1; i <= n; i++){
      for(int j = i; j <= n; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}