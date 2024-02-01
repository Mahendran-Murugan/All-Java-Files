import java.util.Scanner;

public class AmoebaMultiplication {

    public static int Fibo(int n){
        if(n <= 1) return n;
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Fibo(n-1));
    }
}
