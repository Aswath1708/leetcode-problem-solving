package TwoPointers;

import java.util.Scanner;

public class isSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(checkIsSubsequence(s, t));
    }

    public static boolean checkIsSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                if (i == s.length() - 1) {
                    return true;
                }
                i++;
                j++;
            } else {
                j++;
            }

        }
        return false;
    }
}
