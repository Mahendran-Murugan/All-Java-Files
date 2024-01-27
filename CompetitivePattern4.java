import java.util.*;

class CompetitivePattern4{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 1; i <= n; i++){
      for(int j = i; j >= 1; j--){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}