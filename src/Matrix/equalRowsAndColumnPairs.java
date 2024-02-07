package Matrix;

import java.util.*;

public class equalRowsAndColumnPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();
        }

        System.out.println(equalPairs(matrix, n));

    }

    public static int equalPairs(int[][] grid, int n) {
        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int[] row : grid) {
            String s = Arrays.toString(row);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (int col = 0; col < n; col++) {

            int[] colArray = new int[n];

            for (int row = 0; row < n; row++) {
                colArray[row] = grid[row][col];
            }

            count += map.getOrDefault(Arrays.toString(colArray), 0);
        }

        return count;
    }
}
