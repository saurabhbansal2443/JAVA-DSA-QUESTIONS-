import java.util.Arrays;

public class mergesort2 {
    public static void main(String[] args) {
        int[] arr1={0,7,9,11,13};
        int[] arr2={2,3,5,8,10,12};

        int[] res =new int[arr1.length + arr2.length];

        int p1=0;
        int p2=0;
        int p3=0;

        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<arr2[p2]){
                res[p3]=arr1[p1];
                p3++;
                p1++;
            }else{
                res[p3]=arr2[p2];
                p3++;
                p2++;
            }
        }

        if(p1==arr1.length){
            for(int i =p2;i<arr2.length;i++){
                res[p3]=arr2[i];
                p3++;
            }
        }else {
            for(int i =p1;i<arr1.length;i++){
                res[p3]=arr1[i];
                p3++;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
