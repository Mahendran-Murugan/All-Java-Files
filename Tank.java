import java.util.Scanner;

public class Tank{
    public static void main(String[] args){
        final double pi = 3.14;
        Scanner in = new Scanner(System.in);
        double radius , height , volume , waterPerHour , hours ;
        radius = in.nextDouble();
        height = in.nextDouble();
        waterPerHour = in.nextDouble();
        hours = in.nextDouble();
        volume = pi * radius * radius * height;
        if((volume/waterPerHour) < hours){
            System.out.printf("The tank can be filled within %.1f hours", hours);
        }else{
            System.out.printf("The tank can't be filled within %.1f hours", hours);
        }
    }
}