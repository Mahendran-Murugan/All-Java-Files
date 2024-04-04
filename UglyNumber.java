import java.util.Scanner;

public class UglyNumber {

    public static int maxDivide(int no, int b)
    {
        while (no % b == 0)
        no = no / b;
        return no;
    }

    public static boolean predict(int st){
        int no = maxDivide(st, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);
        return (no == 1) ? true : false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int st = 2;
        int ans = 1;
        int count = 1;
        while (count < n) {
            if(predict(st)){
                ans = st;
                count++;
            }
            st++;
        }
        System.out.println(ans);
    }
}
