public class barchart2{
    public static void main(String[] args) {
        int[] arr = {8,1,0,3,4};

        int max =0;

        for(int i=0;i<arr.length;i++){
            max= Math.max(max,arr[i]);
        }

        for(int h=max;h>0;h--){

            for(int i=0;i<arr.length;i++){

                if(h<=arr[i]){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
        

    }
}