import java.util.*;

class PalindromeOrNot{

  static int ans;

  public static int reverse(int n){
    if(n == 0){
      return ans;
    }
    if(n > 0){
      ans = ans * 10 + (n % 10);
      reverse(n/10);
    }
    return ans;
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