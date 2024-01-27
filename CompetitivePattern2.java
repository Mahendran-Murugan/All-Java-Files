import java.util.*;

class CompetitivePattern2{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = n; i >= 1; i--){
      for(int j = n; j >= i; j--){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}