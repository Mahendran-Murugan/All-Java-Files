import java.util.Scanner;

public class FactorialOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1, sum = 1;
        boolean flag =true;
        while(n >= sum){
            if(n == sum){
                flag = false;
                System.out.println("Yes");
                break;
            }
            sum *= i;
            i++;
        }
        if(flag){
            System.out.println("No");
        }
    }
}
