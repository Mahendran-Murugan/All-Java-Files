import java.util.Scanner;

class Pairs{
  int[] arr;
  Pairs(int n){
    this.arr = new int[n];
  }
}

public class AllPairs{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Pairs p = new Pairs(n);
    for(int i = 0; i < n; i++) p.arr[i] = in.nextInt();
    int x = in.nextInt();

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(p.arr[i]+p.arr[j] == x){
          System.out.println(p.arr[i]+ " " + p.arr[j]+" ");
        }
      }
    }
  }
}
