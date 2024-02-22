
import java.util.Scanner;
import java.util.*;

class ArrayList2Collection{
  public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	int n = in.nextInt();
	ArrayList<Integer> a = new ArrayList<Integer>();
	int num  = 0;
	for(int i = 0; i < n; i++){
	  num = in.nextInt();
	  if(i > 0){
		if(a.get(a.size()-1) < num) a.add(num);
	  }
	  else a.add(num);
	}
	System.out.println(a);
  }
}