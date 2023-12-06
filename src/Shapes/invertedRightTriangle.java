package Shapes;

import java.util.*;

public class invertedRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = n; j >= i; j--) {
                if (j >= i) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
