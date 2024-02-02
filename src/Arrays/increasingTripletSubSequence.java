package Arrays;

import java.util.Scanner;

public class increasingTripletSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(increasingTriplet(arr));
    }

    public static boolean increasingTriplet(int[] nums) {
        int l = nums.length;

        if (l < 3) return false;

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for (int k = 0; k < l; k++) {
            if (nums[k] <= i) {
                i = nums[k];
            } else if (nums[k] <= j) {
                j = nums[k];
            } else {
                return true;
            }
        }
        return false;
    }
}
