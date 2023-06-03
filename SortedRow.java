public class SortedRow {
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14},
                        {21,22,23,24},
                        {31,32,33,34},
                        {41,42,43,44}};

        int k = 11 ;
        int r=0;
        int c = arr[0].length - 1;
        int row = -1;
        int col = -1 ;

        while ( r< arr.length && c>=0 ){
            if( arr[r][c]==k){
                row  =r;
                col = c;
                break;
            }else if ( arr[r][c]>k){
                c--;
            }else{
                r++;
            }

        }

        System.out.println(row + "  " + col);

    }
}
