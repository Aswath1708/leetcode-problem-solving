package Strings;

import java.util.*;

public class alternativeStringMerge {

    public static void mergeStrings(String str1, String str2) {
        int ptr1 = 0;
        int ptr2 = 0;

        while (ptr1 < str1.length() && ptr2 < str2.length()) {
            System.out.print(str1.charAt(ptr1));
            System.out.print(str2.charAt(ptr2));
            ptr1++;
            ptr2++;
        }

        while ((ptr1 < str1.length())) {
            System.out.print(str1.charAt(ptr1));
            ptr1++;
        }

        while ((ptr2 < str2.length())) {
            System.out.print(str2.charAt(ptr2));
            ptr2++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        mergeStrings(str1, str2);
    }
}
