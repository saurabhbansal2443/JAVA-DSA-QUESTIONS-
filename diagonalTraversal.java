public class diagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14},
                        {21,22,23,24},
                        {31,32,33,34},
                        {41,42,43,44}};




         for(int k=0;k<arr.length;k++){
         
         for(int i =0;i<arr.length;i++){

            for(int j=0;j<arr[0].length;j++){
             if( i+k==j){
                System.out.println(arr[i][j]);
             }

            }
         }
        }


    }
}
