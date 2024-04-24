public class Pattern {
    public static void main(String[] args) {

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 0; j <= 5; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("#");
        // }
        // System.out.println();
        // }

        // int k = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(k++);
        // if (k > 9)
        // k = 1;
        // }
        // System.out.println();
        // }

        // for (int i = 5; i >= 1; i--) {
        // for (int j = i; j < 5; j++) {
        // System.out.print("");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(k);
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 7; i++) {
        // for (int j = 1; j <= 7; j++) {
        // if (i == 4 || (j == 1 && i >= 4) || (j == 7 && i <= 4))
        // System.out.print("+");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 9; i++) {
        // for (int j = 1; j <= 9; j++) {
        // if (i == 1 || j == 1 || i == 5 || i == 9 || (i >= 5 && j == 9))
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= 10; j++) {
        // if (i == 1 || i == 10 || j == 1 || j == 10)
        // System.err.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= 10; j++) {
        // if (i == 1 || i == 10 || j == 1 || j == 10 || (i == 5 && j <= 10 || j == 5 &&
        // 1 <= 10))
        // System.err.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1 || j == 10 || (i == 5 && j == 5))
                    System.out.print("S");
                else
                    System.out.print(" ");
                System.out.println();
            }
        }

    }
}
