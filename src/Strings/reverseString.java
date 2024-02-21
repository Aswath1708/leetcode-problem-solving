package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s= sc.next();

        printArray(reversedString(s.toCharArray()));
    }

    static void printArray(char[] s){
        for (char c:s) System.out.print(c+" ");
    }

    public static char[] reversedString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - i - 1] = temp;
        }
        return s;
    }
}
