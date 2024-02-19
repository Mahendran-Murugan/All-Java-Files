
import java.util.Scanner;

abstract class AbstractClass{
  int num, sum;
  abstract void getValue();
  abstract void divisorSum(int n);
}
class Calculator extends AbstractClass{
  void getValue(){
    System.out.println(this.sum);
  }
  void divisorSum(int n){
    sum = 1;
    for(int i = 2; i <= n/2; i++){
        if(n % i == 0) sum+=i;
    }
    if(sum > 1) sum += n;
  }
}

class Abstraction3{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Calculator c = new Calculator();
    c.num = in.nextInt();
    c.divisorSum(c.num);
    c.getValue();
  }
}