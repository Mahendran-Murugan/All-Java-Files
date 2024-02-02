import java.util.Scanner;

public class MinimumNoOfOneAdded {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n != 0){
            if(n%2 == 0) n /= 2;
            else{
                n=n-1;
            } 
        }
    }
}
