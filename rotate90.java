puimport java.util.Arrays;

public class rotate90 {
    public static void main(String[] args) {
        int[][] arr = { { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 },
                { 41, 42, 43, 44 } };

        // arr = { arr1, arr2, arr3 , arr4}

        // transpose 

        for(int i=0;i<arr.length ; i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;
            }
        }
        //System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            reverseArray(arr[i]);
        }

        System.out.println(Arrays.deepToString(arr));

    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
