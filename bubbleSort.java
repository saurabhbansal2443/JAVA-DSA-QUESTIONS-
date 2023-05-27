import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr ={5,2,9,1,23,0,3};



        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int ele=arr[i];
                    arr[i]=arr[j];
                    arr[j]=ele;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
