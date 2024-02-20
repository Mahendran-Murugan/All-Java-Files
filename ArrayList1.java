import java.util.*;
import java.util.Scanner;

class ArrayList1{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.nextLine();
      int i = 0;
      ArrayList<String> name = new ArrayList<String>();
      while(i < n){
        name.add(in.nextLine());
        i++;
      }
      Iterator it = name.iterator();
      while(it.hasNext()){
        System.out.println(it.next());
      }
    }
}