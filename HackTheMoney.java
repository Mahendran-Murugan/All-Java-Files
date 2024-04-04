import java.util.Scanner;

public class HackTheMoney {
    public static boolean val = false;
    public static void Hack(int n){
        System.out.println(n);
        if(n == 1){
            val = true;
            return;
        }
        if(n == 0) return;
        if(!(n-10 <= 9)){
            Hack(n/10);
        }
        if(!(n / 20 <= 9)){
            Hack(n/20);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Hack(n);
        if(val){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
