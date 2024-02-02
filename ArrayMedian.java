import java.util.Arrays;
import java.util.Scanner;

public class ArrayMedian {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        double[] arr = new double[n+1];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextDouble();
        }
        Arrays.sort(arr);
        if(n % 2 != 0) System.out.printf("The median of the array is %.2f",arr[(n/2)+1]);
        else System.out.printf("The median of the array is %.2f", (arr[n/2]+arr[(n/2)+1])/2);
    }
}