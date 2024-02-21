
import java.util.Scanner;

class Series{
    public static void main (String[] args){
        int n, count = 0;
        boolean flag = true;
        Scanner in = new Scanner (System. in) ;
        n = in.nextInt();
        for(int i = 101;count < n;i++){
            flag = true;
            for (int j = 2; j <= Math. sqrt (i); j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                count++;
            }
        }
    }
}