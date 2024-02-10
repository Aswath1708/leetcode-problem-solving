package TwoPointers;

import java.util.Scanner;

public class removingStarsFromAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        int j = 0;
        char[] strArray = s.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == '*') {
                j--;
            } else {
                strArray[j] = strArray[i];
                j++;
            }
        }
        return new String(strArray).substring(0, j);
    }
}
