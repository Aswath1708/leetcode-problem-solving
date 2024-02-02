package Strings;

import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] chars = new char[n];

        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int index = 0;

        int i = 0;

        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[index++] = chars[i];

            if (j - i > 1) {
                String count = j - i + "";

                for (char c : count.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }

        return index;
    }
}
