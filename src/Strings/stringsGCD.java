package Strings;

import java.util.*;

public class stringsGCD {

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int length1 = str1.length();
        int length2 = str2.length();

        int gcd = returngcd(length1, length2);

        return str1.substring(0, gcd);
    }

    public static int returngcd(int a, int b) {
        return b == 0 ? a : returngcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.print(gcdOfStrings(str1, str2));
    }
}
