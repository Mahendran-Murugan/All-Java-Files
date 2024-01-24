import java.util.Scanner;

public class LoopSeries{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int val =2;
        int n = 0;
        n = in.nextInt();
        int calc = 0;
        for(int i = 0; i < n; i++){
            System.out.print(val+" ");
            calc = val * 2 - i;
            val = calc;
        }
    }
}