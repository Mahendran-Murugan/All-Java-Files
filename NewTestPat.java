public class NewTestPat {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;

        for (int i = 1; i <= row; i++) {
            if (i == 1 || i == row) {
                for (int j = 1; j <= col; j++) {
                    if (i == 1) {
                        if (j == 1 || j >= col / 2 + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (j == col || j <= col / 2 + 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            } else if (i == row / 2 + 1) {
                for (int j = 1; j <= col; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= col; j++) {
                    if (i <= row / 2) {
                        if (j == 1 || j == col / 2 + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (j == col || j == col / 2 + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}