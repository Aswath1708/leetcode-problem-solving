package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class maxNumberOfKSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(maxOperations(arr, k));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        int ptr1 = 0;
        int ptr2 = nums.length - 1;

        while (ptr1 < ptr2) {
            if (nums[ptr1] + nums[ptr2] == k) {
                count++;
                ptr1++;
                ptr2--;
            } else {
                if (nums[ptr1] + nums[ptr2] < k) {
                    ptr1++;
                } else {
                    ptr2--;
                }
            }
        }

        return count;
    }
}
