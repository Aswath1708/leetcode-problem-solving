package HashSet;

import java.util.*;

public class findTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int m = sc.nextInt();

        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int el : nums1) {
            set1.add(el);
        }

        for (int el : nums2) {
            set2.add(el);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int el : set1) {
            if (!set2.contains(el)) list1.add(el);
        }

        for (int el : set2) {
            if (!set1.contains(el)) list2.add(el);
        }

        res.add(list1);
        res.add(list2);

        return res;
    }
}
