public class spiralTraversal {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12  }
                
        };

        int n = arr.length;
        int m = arr[0].length;

        int rowmin = 0;
        int rowmax = n - 1;
        int colmin = 0;
        int colmax = m - 1;

        int ele = 0;

        while (ele < n * m) {

            for (int row = rowmin; row <= rowmax && ele <n*m; row++) {
                System.out.println(arr[row][colmin]);
                ele++;
            }

            for (int col = colmin + 1; col <= colmax && ele <n*m; col++) {
                System.out.println(arr[rowmax][col]);
                ele++;
            }

            for (int row = rowmax - 1; row >= rowmin && ele <n*m; row--) {
                System.out.println(arr[row][colmax]);
                ele++;
            }

            for (int col = colmax - 1; col >= colmin + 1 && ele <n*m; col--) {
                System.out.println(arr[rowmin][col]);
                ele++;
            }

            rowmin++;
            rowmax--;
            colmin++;
            colmax--;

        }

    }
}
