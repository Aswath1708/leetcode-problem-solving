package SlidingWindow;

import java.util.Scanner;

public class maxConsecutiveOnesIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;

        while (i < nums.length) {
            if (nums[i] == 0) k--;
            if (k < 0 && nums[j++] == 0) k++;

            i++;
        }

        return i - j;
    }
}
