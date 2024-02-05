package PrefixSum;

import java.util.Scanner;

public class findHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(largestAltitude(arr));

    }

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;

        for (int i : gain) {

            sum += i;
            max = Math.max(max, sum);
        }

        return max;
    }
}
