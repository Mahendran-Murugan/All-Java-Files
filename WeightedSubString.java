import java.util.Scanner;

public class WeightedSubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[26];
        arr[0] = 1;
        String ans = "";
        int i;
        for( i =1; i < 26;i++){
            arr[i] = ((i+1) * arr[i-1])+arr[i-1];
            if(arr[i] > n){
                arr[i] = 0;
                break;
            }
        }
        i--;
        while(n > 0){
            while(n >= arr[i] && (n % arr[i]) >= 0){
                n -= arr[i];
               ans = (char)(65+i) + ans;
            }
            i--;
        }
        System.out.println(ans);
    }
}
