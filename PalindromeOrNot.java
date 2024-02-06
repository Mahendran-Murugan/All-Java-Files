import java.util.*;

class PalindromeOrNot{

  public static int reverse(int n){
    if(n <= 1) return 1;
    return n % 10+ 10 * reverse(n/10);
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if(n == reverse(n)){
      System.out.print("true");
    }else{
      System.out.print("false");
    }
  }
}