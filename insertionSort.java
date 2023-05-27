public class insertionSort {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,1};

        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
