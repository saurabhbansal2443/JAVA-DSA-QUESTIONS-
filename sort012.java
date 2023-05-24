// Question link --> https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&curated[]=1&sortBy=submissions

import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 2, 1, 0, 2, 1 };

        sort012(arr);

        System.out.print(Arrays.toString(arr));

    }

    public static void sort012(int a[]) {
        int[] fre = new int[3];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                fre[0] = fre[0] + 1;
            } else if (a[i] == 1) {
                fre[1] = fre[1] + 1;
            } else {
                fre[2] = fre[2] + 1;
            }
        }

        int ptr = 0;

        for (int i = 0; i < fre[0]; i++) {
            a[ptr] = 0;
            ptr++;
        }
        for (int i = 0; i < fre[1]; i++) {
            a[ptr] = 1;
            ptr++;
        }
        for (int i = 0; i < fre[2]; i++) {
            a[ptr] = 2;
            ptr++;
        }
    }
}
