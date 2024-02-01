import java.util.Scanner;

public class SumOf2 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+arr[i+n]);
        }
    }
}
