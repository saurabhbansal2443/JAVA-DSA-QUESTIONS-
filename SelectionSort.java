import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,68,0,1,4};

        for(int i=0;i<arr.length;i++){

            int minIdx =i;
            int currmin = arr[i];

            for(int j=i+1;j<arr.length;i++){
                if(currmin>arr[j]){
                    minIdx=j;
                    currmin = arr[j];
                }

            }

            int ele = arr[i];
            arr[i]=currmin;
            arr[minIdx]=ele;
        }

        System.out.println(Arrays.toString(arr));
    }
}
