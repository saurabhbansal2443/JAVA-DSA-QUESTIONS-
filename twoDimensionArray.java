import java.util.*;

public class twoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < arr.length; i++) {  //input loop

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < arr.length; i++) {   //output loop 

            for (int j = 0; j < arr[0].length; j++) {

               System.out.println(arr[i][j]);

            }
        }

        
    }
}
