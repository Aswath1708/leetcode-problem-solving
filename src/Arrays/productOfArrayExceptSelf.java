package Arrays;

import java.util.Scanner;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(productExceptSelf(arr));

    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {

        int l = nums.length;
        int[] outputArr = new int[l];

        outputArr[0] = 1;

        for (int i = 1; i < l; i++) {
            outputArr[i] = outputArr[i - 1] * nums[i - 1];
        }

        int temp = 1;

        for (int i = l - 1; i >= 0; i--) {
            outputArr[i] = outputArr[i] * temp;

            temp *= nums[i];
        }

        return outputArr;

    }
}
