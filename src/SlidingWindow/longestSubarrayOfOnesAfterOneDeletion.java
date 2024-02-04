package SlidingWindow;

import java.util.Scanner;

public class longestSubarrayOfOnesAfterOneDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int i = 0, j = 0;
        int k = 1;

        while (i < nums.length) {
            if (nums[i] == 0) k--;
            if (k < 0 && nums[j++] == 0) k++;

            i++;
        }

        return i - j - 1;
    }
}
