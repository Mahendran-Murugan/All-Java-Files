import java.util.Scanner;

public class LoopSeries7{
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print((int)Math.pow(i,i)+" ");
        }
    }
}