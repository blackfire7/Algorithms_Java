package starPatterns;

public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5;

        /** PATTERN - 1 */
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /** PATTERN - 2 */
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                if (j > 0) System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /** PATTERN - 3 */
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /** PATTERN - 4 */
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j > 0) System.out.print(" ");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /** PATTERN - 5 */
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /** PATTERN - 6 */
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
        }


        System.out.println();
        System.out.println();

        /** PATTERN - 7 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /** PATTERN - 8 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}