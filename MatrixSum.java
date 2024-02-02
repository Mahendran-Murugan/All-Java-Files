import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    int[][] arr = new int[m][n];
    int sum = 0;
    for(int i =0; i < m; i++){
      for(int j =0; j < n; j++){
        arr[i][j] = in.nextInt();
        sum += arr[i][j];
      }
    }
    System.out.println(sum);
  }
}
