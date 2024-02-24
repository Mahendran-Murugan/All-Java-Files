package Collections;
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        int n, pos, ele;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        pos = in.nextInt();
        ele = in.nextInt();
        pos--;
        for(int i = n; i >= pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = ele;
        for(int i = 0; i <= n; i++) System.out.println(arr[i]);
    }
}