
import java.util.Scanner;
public class SportsDayCelebration {
    public static void main(String args[]) {
        int noOfStudents = 0, noOfTeams = 0;
        Scanner in = new Scanner(System.in);
        noOfStudents = in.nextInt();
        noOfTeams = in.nextInt();
        System.out.printf("%d %d", (noOfStudents / noOfTeams), (noOfStudents % noOfTeams));
    }
}