package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println(convertIntegerToRoman(n));
    }

    public static String convertIntegerToRoman(int n){
        Map<String,Integer> map = new LinkedHashMap<>();

        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);

        StringBuilder st = new StringBuilder();

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            while (n>=entry.getValue()){
                n-= entry.getValue();
                st.append(entry.getKey());
            }
        }
        return st.toString();
    }

}
