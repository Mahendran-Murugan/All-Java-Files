package Pattern;
import java.util.Scanner;

public class CompetitivePattern14 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int i =0; i < n; i++){
          char a = 'a';
          for(int j = 0; j <= i; j++){
            System.out.printf("%c", (a+j));
          }
          System.out.println();
        }
    }
}