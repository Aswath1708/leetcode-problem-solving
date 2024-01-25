package Arrays;

import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(plusOne(arr));
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + ",");
        }
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArr = new int[length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
