import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        int forwardDiagonal = 0, backwardDiagonal = 0;
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
                if(i == j) forwardDiagonal += arr[i][j];
                if(i+j == n-1) backwardDiagonal += arr[i][j];
            }
        }
      if(forwardDiagonal == backwardDiagonal)
        System.out.println("yes");
      else
        System.out.println("no");
    }
}
