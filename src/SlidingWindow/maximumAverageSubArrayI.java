package SlidingWindow;

import java.util.Scanner;

public class maximumAverageSubArrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int l = nums.length;
        int sum = 0;


        if (l == k) {
            for (int el : nums) {
                sum += el;
            }
            return (double) sum / l;
        }
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        int startIndex = 0;
        int endIndex = k;

        while (endIndex < l) {
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            max = Math.max(max, sum);
        }
        return (double) max / k;
    }

}
