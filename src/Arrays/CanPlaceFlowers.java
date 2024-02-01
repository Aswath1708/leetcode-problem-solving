package Arrays;

import java.util.Scanner;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int plants = sc.nextInt();

        System.out.println(ifPossible(arr,plants));
    }

    public static boolean ifPossible(int[] flowerbed, int n) {
        int validPots = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {

                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    validPots++;
                }

            }
            if (validPots >= n) {
                return true;
            }
        }

        return false;
    }
}
