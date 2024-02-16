import java.util.*;

public class Pairs{
  void read(int[] arr, int n){
    Scanner in = new Scanner(System.in);
    for(int i = 0; i < n; i++) arr[i] = in.nextInt();
    int x = in.nextInt();
    calc(arr, n, x);
  }
  void calc(int[] arr, int n, int x){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
          if(arr[i]+arr[j] == x){
            System.out.println(arr[i]+ " " + arr[j]+" ");
          }
      }
    }
  }
}

class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    Pairs p = new Pairs();
    p.read(arr, n);
  }
}