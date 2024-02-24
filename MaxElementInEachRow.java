import java.util.Scanner;

class MaxElementInEachRow{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    int[][] arr = new int[m][n];
    for(int i =0; i < m; i++){
      int max = -1;
      for(int j =0; j < n; j++){
        arr[i][j] = in.nextInt();
        max = Math.max(max, arr[i][j]);
      }
      System.out.println(max+"\n");
    }
  }
}
