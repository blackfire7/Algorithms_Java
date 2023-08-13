package starPatterns;

public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("PATTERN : 1");

        /** PATTERN - 1 */
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 2");
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
        System.out.println("PATTERN : 3");
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
        System.out.println("PATTERN : 4");
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
        System.out.println("PATTERN : 5");
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
        System.out.println("PATTERN : 6");
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
        System.out.println("PATTERN : 7");
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
        System.out.println("PATTERN : 8");
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

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 9");
        System.out.println();

        /** PATTERN - 9 */
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = rows - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 10");
        System.out.println();

        /** PATTERN - 10 */
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 11");
        System.out.println();

        /** PATTERN - 11 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 12");
        System.out.println();

        /** PATTERN - 12 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i > 1) System.out.print("*");
            }
            if (i > 1) System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 13");
        System.out.println();

        /** PATTERN - 13 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            if (i > 1) System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 14");
        System.out.println();

        /** PATTERN - 14 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print("* ");
            }
            if (i > 1) System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 15");
        System.out.println();

        /** PATTERN - 15 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 16");
        System.out.println();

        /** PATTERN - 16 */
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("PATTERN : 17");
        System.out.println();

        /** PATTERN - 17 */
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                if (i == 1 || j == rows || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }


    }
}