package Pattern;

import java.util.Scanner;

public class CompetitivePattern13 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int i =n; i >= 1; i--){
	      for(int k = n-2; k >= n-i ; k--){
	        System.out.print(" ");
	      }
	      for(int j = n; j >= i; j--){
	        System.out.print(j);
	      }
	      System.out.println();
	    }
	  }
}
