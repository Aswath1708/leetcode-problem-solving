package Strings;

import java.util.Scanner;

public class reverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] strArray = str.toCharArray();
        int ptr1 = 0;
        int ptr2 = strArray.length - 1;

        while (ptr1 < ptr2) {
            if (checkVowel(strArray[ptr1]) && checkVowel(strArray[ptr2])) {
                char temp = strArray[ptr1];
                strArray[ptr1] = strArray[ptr2];
                strArray[ptr2] = temp;
                ptr1++;
                ptr2--;
            } else if (!checkVowel(strArray[ptr1])) {
                ptr1++;
            } else if (!checkVowel(strArray[ptr2])) {
                ptr2--;
            }
        }
        System.out.println(new String(strArray));
    }

    public static boolean checkVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';

    }
}
