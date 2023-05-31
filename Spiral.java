import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int m = 4;

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ele = 0;
        int rowmin = 0;
        int rowmax = arr.length - 1;
        int colmin = 0;
        int colmax = arr[0].length - 1;

        System.out.println("Output:");

        while (ele < m * n) {
            for (int r = rowmin; r <= rowmax && ele < m * n; r++) {
                System.out.println(arr[r][colmin]);
                ele++;
            }

            for (int c = colmin + 1; c <= colmax && ele < m * n; c++) {
                System.out.println(arr[rowmax][c]);
                ele++;
            }

            for (int r = rowmax - 1; r >= rowmin && ele < m * n; r--) {
                System.out.println(arr[r][colmax]);
                ele++;
            }

            for (int c = colmax - 1; c >= colmin+1 && ele < m * n; c--) {
                System.out.println(arr[rowmin][c]);
                ele++;
            }

            rowmax--;
            rowmin++;
            colmax--;
            colmin++;
        }
    }
}
