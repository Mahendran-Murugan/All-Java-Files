

import java.util.Scanner;

public class Cricket {
    public static void main (String[] args) {
        int noOfBalls = 0, totalRuns = 0, noOfRuns = 0, noOfBallsBowled = 0;
        Scanner in = new Scanner(System.in);
        noOfBalls = in.nextInt();
        totalRuns = in.nextInt();
        noOfRuns = in.nextInt();
        noOfBallsBowled = in.nextInt();
        int totalOvers = noOfBalls / 6;
        double oversFinished = (((double) noOfBallsBowled / 6) + (noOfBallsBowled % 6) / 10.0);
        double currentRunRate = noOfRuns / oversFinished, totalRunRate = (totalRuns * 1.0 / totalOvers);
        System.out.printf("%d %.1f %.1f %.1f ", totalOvers, oversFinished,
                currentRunRate, totalRunRate);
        if (currentRunRate > totalRunRate) System.out.println("Eligible to Win");
        else System.out.println("Not Eligible to Win");
    }
}
