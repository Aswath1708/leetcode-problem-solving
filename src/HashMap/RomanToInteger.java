package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(convertRomanToInteger(S));
    }

    public static int convertRomanToInteger(String S) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        int res = map.get(S.charAt(S.length()-1));

        for (int i = S.length()-2; i >= 0; i--) {
            if(map.get(S.charAt(i))>=map.get(S.charAt(i+1))){
                res+=map.get((S.charAt(i)));
            }else{
                res-=map.get((S.charAt(i)));
            }
        }

        return res;
    }
}
