import java.util.*;
public class spanOfArray2 {
    public static void main(String[] args) {
        int[] arr={13,27,3,5,12,76};

        int ans =spanOfArray(arr);
        System.out.println(ans);
    }

    public static int spanOfArray(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min,arr[i]);
        }

        return max-min;
    }


    
}
