public class Patterns {
    public static void main(String[] args) {
        // 1 pattern
        // for (int line = 1; line <= 4; line++) {
        // for (int star = 1; star <= line; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 2 pattern
        // int n = 4;
        // for (int line = 1; line <= n; line++) {
        // for (int star = 1; star <= n - line + 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 3 pattern
        // int n = 6;
        // for (int line = 1; line <= n; line++) {
        // for (int num = 1; num <= line; num++) {
        // System.out.print(num);
        // }
        // System.out.println();
        // }

        // 4 pattern
        // int n = 5;
        // char ch = 'A';
        // for (int line = 1; line <= n; line++) {
        // for (int chars = 1; chars <= line; chars++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // 5 pattern
        // int totRows = 5;
        // int totCols = 5;
        // for (int i = 1; i <= totRows; i++) {
        // for (int j = 1; j <= totCols; j++) {
        // if (i == 1 || i == totRows || j == 1 || j == totCols) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 6 pattern
        // int row = 5;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= row - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 7 pattern
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 8 pattern
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 9 pattern
        // int count = 1;
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(count);
        // count++;
        // }
        // System.out.println();
        // }

        // 10 pattern
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // 11 pattern
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 12 pattern
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 13 pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || i == n || j == 1 || j == n) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 14 pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (2 * i) - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // 15 pattern
        // int n = 3;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }
        // }
        // System.out.println();
        // }

        // 16 pattern
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                if ((i + j) % 2 == 0 || i == j || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                if ((i + j) % 2 == 0 || i == j || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
