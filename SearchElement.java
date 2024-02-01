import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int n, serEle;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        serEle = in.nextInt();
        boolean flag = false;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            if(serEle == arr[i]) flag = true;
        }
        if(flag) System.out.printf("%d is present in the array", serEle);
        else System.out.printf("%d is not present in the array", serEle);
    }
}
