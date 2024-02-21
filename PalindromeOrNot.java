import java.util.Scanner;

class PalindromeOrNot{

  static int ans;

  public static int reverse(int n, int rev){
    if(n == 0){
      return rev;
    }
    return reverse(n/10,rev*10+n%10);
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if(n == reverse(n, 0)){
      System.out.print("true");
    }else{
      System.out.print("false");
    }
  }
}