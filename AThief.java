import java.util.*;

public class AThief
{
    
    public static int maxStolenValue(int[] arr, int n){
        if(n == 0) return arr[n];
        if(n < 0) return 0;
        int pick = 0, notPick = 0;
        pick = arr[n] + maxStolenValue(arr, n-2);
        notPick += maxStolenValue(arr, n-1);
        return Math.max(pick, notPick);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = in.nextInt();
        System.out.print(maxStolenValue(arr, n-1));
    }
}
