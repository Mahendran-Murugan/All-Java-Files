
import java.util.Scanner;

public class CricketStadium {
    public static void main (String[] args) {
        int length = 0, breadth = 0;
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        breadth = in.nextInt();
        System.out.printf("%d %d", (2 * (length + breadth)), (length * breadth));
    }
}
