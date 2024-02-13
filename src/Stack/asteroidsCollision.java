package Stack;

import java.util.Scanner;
import java.util.Stack;

public class asteroidsCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) asteroids[i] = sc.nextInt();

        printArray(asteroidCollision(asteroids));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i : asteroids) {

            boolean flag = true;

            while (!stack.isEmpty() && stack.peek() > 0 && i < 0) {
                if (stack.peek() == -i) {
                    stack.pop();
                    flag = false;
                    break;
                } else if (stack.peek() < -i) {
                    stack.pop();
                    flag = true;

                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) stack.push(i);

        }
        int[] arr = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--)
            arr[i] = stack.pop();

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + ", ");
    }

}
