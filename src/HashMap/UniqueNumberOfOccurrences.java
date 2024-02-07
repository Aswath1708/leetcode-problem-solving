package HashMap;

import java.util.*;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int el : arr) map.put(el, map.getOrDefault(el, 0) + 1);

        Set<Integer> set = new HashSet<>(map.values());

        return map.size() == set.size();
    }
}
