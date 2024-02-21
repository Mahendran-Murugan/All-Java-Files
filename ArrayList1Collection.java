
import java.util.*;
import java.util.Scanner;

class ArrayList1Collection{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    ArrayList<String> a = new ArrayList<String>();
    for(int i = 0; i < n; i++){
      a.add(in.next());
    }
    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        if(a.get(j-1).length() > a.get(j).length()){
          String temp = a.get(j-1);
          a.set(j-1,a.get(j));
          a.set(j,temp);
        }
      }
    }
    System.out.println(a);
  }
}