import java.util.Scanner;

public class Calendar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = 0, month = 0, noOfDays = 0;
        boolean flag = false;
        month = in.nextInt();
        year = in.nextInt();
        int monthArr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            flag = true;
        }
        switch(month){
            case 2:
                if(flag){
                    monthArr[month-1] = 29;
                }
                break;
            default:
                break;
        }
        System.out.println(monthArr[month-1]);
    }
}