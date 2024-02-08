

import java.util.Scanner;

public class DecimalToBinary {

    public static void toBinary(int n){
        if(n > 0){
            toBinary(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        toBinary(n);
    }
}
