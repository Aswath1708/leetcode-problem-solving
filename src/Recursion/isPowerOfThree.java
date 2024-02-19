package Recursion;

import java.util.Scanner;

public class isPowerOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(findIfPowerOfThree(n));
    }

    public static boolean findIfPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
        if (n % 3 != 0) return false;

        return findIfPowerOfThree(n / 3);
    }

}
