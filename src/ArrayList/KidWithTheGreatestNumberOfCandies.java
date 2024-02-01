package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(kidsWithCandies(arr, x));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();

        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }

        return res;
    }
}
