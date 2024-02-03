import java.util.Scanner;

public class LowerTriangularMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        boolean flag= true;
        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        l1:
        for(int i =0; i < n; i++){
            for(int j =n-1; j > i; j--){
                if(arr[i][j] != 0){
                    flag = !flag;
                    break l1;
                } 
            }
        }
        if(flag)
        System.out.println("yes");
        else
        System.out.println("no");
  }
}
