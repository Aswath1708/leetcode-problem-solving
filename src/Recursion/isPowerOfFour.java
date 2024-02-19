package Recursion;

import java.util.Scanner;

public class isPowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(findIfPowerOfFour(n));
    }

    public static boolean findIfPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n <= 0)
            return false;
        if (n % 4 != 0)
            return false;

        return findIfPowerOfFour(n / 4);
    }
}
