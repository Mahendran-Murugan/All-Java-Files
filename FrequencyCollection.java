
import java.util.*;
import java.util.Scanner;

class FrequencyCollection{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int frequency = 0;
    ArrayList<String> a = new ArrayList<String>();
    for(int i = 0; i < n; i++){
      a.add(in.next());
    }
    String x = in.next();
    while(a.contains(x)){
      a.remove(x);
      frequency++;
    }
    System.out.println(frequency);
  }
}