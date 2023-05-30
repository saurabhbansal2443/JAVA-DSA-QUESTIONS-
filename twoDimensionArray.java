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

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {   //maximum in 2d Array

            for (int j = 0; j < arr[0].length; j++) {

               if(max<arr[i][j]){
                max=arr[i][j];
               }

            }
        }

        int[][] arr2=new int[3][4];   //check two 2d array are equal 

        if((arr.length == arr2.length) && (arr[0].length == arr2[0].length) ){
            for (int i = 0; i < arr.length; i++) {  

                for (int j = 0; j < arr[0].length; j++) {
    
                   if(arr[i][j] != arr2[i][j]){
                    System.out.println("Not Equal");
                    break;
                   }
    
                }
            }
            
        }else{
            System.out.println("Not Equal");
        }

        int[][] arr3=new int[arr.length][arr[0].length]; // copy an array 

        for (int i = 0; i < arr.length; i++) {  

            for (int j = 0; j < arr[0].length; j++) {

               arr3[i][j]=arr[i][j];

            }
        }

        // serach a specific element 

        int k =5;

        for (int i = 0; i < arr.length; i++) {  

            for (int j = 0; j < arr[0].length; j++) {

              if(k==arr[i][j]){
                System.out.println(arr[i][j]);
              }

            }
        }

        // average of the 2d array 
        int sum =0;
        for (int i = 0; i < arr.length; i++) {  

            for (int j = 0; j < arr[0].length; j++) {

             sum += arr[i][j];

            }
        }
        int avg = sum / (arr.length * arr[0].length);

        // max sum of the rows 

        int maxSum =0;

        for (int i = 0; i < arr.length; i++) {  
                int currMax=0;
            for (int j = 0; j < arr[0].length; j++) {

            currMax+=arr[i][j];

            }

            maxSum= Math.max(maxSum,currMax);
        }

        System.out.println(maxSum);

        // minimum sum of column in 2-D array 
        int min = Integer.MAX_VALUE;
        for(int col = 0 ; col<arr[0].length;col++){
            int currMin = 0;
            for(int row=0;row<arr.length;row++){
                currMin+=arr[row][col];
            }

            min =Math.min(min,currMin);
        }
        System.out.println(min);




        
    }
}
