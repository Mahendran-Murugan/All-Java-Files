import java.util.Scanner;

public class CompatableArray {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        boolean flag= true;
        int[] arr = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] <= arr[i+n]){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Compatible");
        else System.out.println("Incompatible");
    }
}