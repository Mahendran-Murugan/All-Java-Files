import java.util.*;

public class FriendlyPair {
    public static void main(String[] args) {
        int n1, n2, n1Res = 0, n2Res = 0;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        for(int i = 1; i <= n1/2; i++){
            if(n1 % i == 0) n1Res += i;
        }
        for(int i = 1; i <= n2/2; i++){
            if(n2 % i == 0) n2Res += i;
        }
        if(n1Res/n1 == n2Res/n2) System.out.println("Firendly Pair");
        else System.out.println("Not a Firendly Pair");

    }
}
