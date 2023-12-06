package Shapes;

import java.util.*;

public class rightToLeftRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = n; j >= 1; j--) {
                if (j == i) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
