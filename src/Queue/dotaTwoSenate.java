package Queue;

import java.util.*;

public class dotaTwoSenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senate = sc.next();

        System.out.println(predictPartyVictory(senate));
    }

    public static String predictPartyVictory(String senate) {

        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') radiant.add(i);
            else dire.add(i);
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            if (radiant.peek() > dire.peek()) dire.add(n++);
            else radiant.add(n++);

            radiant.poll();
            dire.poll();
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
