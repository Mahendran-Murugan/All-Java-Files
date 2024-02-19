
import java.util.Scanner;

class Alphabets{
  char a;
  Alphabets(char a){
    this.a = a;
  }
  String alpha(){
    if(a == 'a'|| a == 'e' || a== 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
      return "vowel";
    }
    return "consonant";
  }
}

public class AlphabetsOops {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    Alphabets a = new Alphabets(ch);
    System.out.println(ch+" :"+a.alpha());
  }
}