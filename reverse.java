
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int start=0;
        int end = arr.length-1;
        
        while(start<end){

            int e=arr[start];
            arr[start]=arr[end];
            arr[end]=e;

            start++;
            end--;
        }


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        
    }
}
