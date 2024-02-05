package Strings;

import java.util.Scanner;

public class firstNonRepeatingCharacterInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        char[] chars = s.toCharArray();

        for (char c : chars) freq[c - 'a']++;

        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) return i;
        }

        return -1;

    }
}
