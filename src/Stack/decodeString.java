package Stack;

import java.util.*;

public class decodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(decodedString(s));
    }

    public static String decodedString(String s) {

        Stack<Integer> integers = new Stack<>();
        Stack<String> chars = new Stack<>();

        String res = "";

        for (int i = 0; i < s.length(); ) {
            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                integers.push(count);

            } else if (s.charAt(i) == '[') {
                chars.push(res);
                res = "";
                i++;
            } else if (s.charAt(i) == ']') {
                StringBuilder sb = new StringBuilder(chars.pop());
                int count = integers.pop();
                for (int k = 0; k < count; k++) sb.append(res);

                res = sb.toString();
                i++;
            } else {
                res += s.charAt(i);
                i++;
            }
        }

        return res;
    }
}
