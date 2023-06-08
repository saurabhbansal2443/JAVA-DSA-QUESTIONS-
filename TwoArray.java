public class TwoArray {
    public static void main(String[] args) {
        
        int[] arr1 ={1,2,3,4};
        int[] arr2 ={1,2};
        int[] arr3 ={1,2,3};

        int[][] res = {arr1,arr2,arr3};

        for(int i =0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j] + "  ");
            }
            System.out.println();
        }


    }

}
