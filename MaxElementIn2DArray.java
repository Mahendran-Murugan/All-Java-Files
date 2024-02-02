import java.util.*;

class MaxElementIn2DArray{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    int[][] arr = new int[m][n];
    int max = Integer.MIN_VALUE;
    for(int i =0; i < m; i++){
      for(int j =0; j < n; j++){
        arr[i][j] = in.nextInt();
        max = Math.max(max, arr[i][j]);
      }
    }
    System.out.println(max);
  }
}