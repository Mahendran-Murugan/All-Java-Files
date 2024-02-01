import java.util.Scanner;

/**
 * CollatzProgram
 */
public class CollatzProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n != 1){
            if(n % 2 == 0) n = n / 2;
            else n = 3*n+1;
            count++;
            System.out.println(n); 
        }
        System.out.println(count); 
    }
}