package Strings;

import java.util.Scanner;

public class reverseWordsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String[] a = s.split(" +");

        String res = "";

        for (int i = a.length - 1; i >= 0; i--) {
            res = res + a[i] + " ";
        }

        return res.trim();
    }
}
