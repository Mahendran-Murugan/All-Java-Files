import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.err.println(sum);
    }
}
