package SlidingWindow;

import java.util.Scanner;

public class maxNumberOfVowelsInSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {


        int count = 0;

        for (int i = 0; i < k; i++) {
            if (checkVowel(s.charAt(i))) count++;
        }

        int max = count;

        int startIndex = 0;
        int endIndex = k;

        while (endIndex < s.length()) {
            if (checkVowel(s.charAt(startIndex))) count--;
            startIndex++;

            if (checkVowel(s.charAt(endIndex))) count++;
            endIndex++;

            max = Math.max(max, count);
        }

        return max;
    }

    public static boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
