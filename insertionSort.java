public class insertionSort {
    public static void main(String[] args){
        int[] arr={1,7,3,2,0,6,1};

        for(int i =1 ; i<arr.length;i++){

            for(int j = i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }

            }
        }


        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
