import java.util.Scanner;

public class MaxElementInEachColumn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        int max = -1;
        for(int i =0; i < m; i++){
            for(int j =0; j < n; j++){
                arr[i][j] = in.nextInt();
            }   
        }        
        for(int i = 0; i < n; i++){
            max = -1;
            for(int j = 0; j < m; j++){
                max = Math.max(max, arr[j][i]);     
                System.out.print(i+" "+j+" ");
            }
            // System.out.println(max+" ");
            // if(i < n-1)
            // System.out.print('\n');
        }
    }
}