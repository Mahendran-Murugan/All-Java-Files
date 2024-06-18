public class Day9Testing {
    public static void alphabetPattern(int n) {
        int index, side_index;
        int top = 1, bottom = 1, diagonal = n - 1;
        for (index = 0; index < n; index++)
            System.out.print(top++ + " ");
        System.out.println();
        for (index = 1; index < n - 1; index++) {
            for (side_index = 0; side_index < 2 * (n - index - 1); side_index++)
                System.out.print(" ");
            System.out.print(diagonal--);
            System.out.println();
        }

        for (index = 0; index < n; index++)
            System.out.print(bottom++ + " ");
    }

    public static void main(String[] args) {
        alphabetPattern(5);
        System.out.println();
    }
}