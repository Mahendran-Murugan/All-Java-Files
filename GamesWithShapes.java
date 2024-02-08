

import java.util.Scanner;

public class GamesWithShapes {
    public static void main (String[] args) {
        int radius = 0, length = 0;
        Scanner in = new Scanner(System.in);
        radius = in.nextInt();
        length = in.nextInt();
        if (length >= (2 * radius)) System.out.println ("circle can be inside a square");
        else System.out.println("circle cannot be inside a Square");
    }
}
