import java.util.Scanner;

class OccurenceInArray{
  
  public static void occurence(int n, int seEle, int[] arr, int count){
    if(n < 0){
      System.out.println(count);
      return;
    }
    if(arr[n] == seEle) count++;
    occurence(n-1, seEle, arr, count);
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = in.nextInt();
    }
    int x = in.nextInt();
    occurence(n-1, x, arr, 0);
  }
}