import java.util.Scanner;

public class TresureHunt{
    public static void main(String[] args){
        double tresure = 0, benShareP = 0, bbShareP = 0, benShare = 0, bbShare = 0, otherShare = 0;
        Scanner in = new Scanner(System.in);
        tresure = in.nextInt();
        benShareP = in.nextInt();
        bbShareP = in.nextInt();
        benShare =(int)(tresure * (benShareP/100));
        tresure -= benShare;
        bbShare = (int)(tresure * (bbShareP/100));
        tresure -= bbShare;
        otherShare = (int)(tresure/3);
        System.out.printf("%.0f\n%.0f\n%.0f",benShare,bbShare,otherShare);
    }
}