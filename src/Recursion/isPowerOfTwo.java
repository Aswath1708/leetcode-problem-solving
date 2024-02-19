package Recursion;

import java.util.Scanner;

public class isPowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(findIfPowerOfTwo(n));
    }

    public static boolean findIfPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
        if (n % 2 == 1) return false;

        return findIfPowerOfTwo(n / 2);
    }
}
