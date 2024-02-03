import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        boolean flag= true;
        for(int i =0; i < n; i++){
        for(int j =0; j < n; j++){
            arr[i][j] = in.nextInt();
            if(i != j && arr[i][j] != 0){
                flag = false;
                break;
            }
        }
    }
    if(flag)
    System.out.println("yes");
    else
    System.out.println("no");
  }
}