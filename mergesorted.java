import java.util.*;
public class mergesorted {
    public static void main(String[] args) {
        
        int[] arr1={1,2,5,6,7,8};
        int[] arr2={1,3,4,5,6,8,10};
        int[] arr3=new int[arr1.length+ arr2.length];



        int min=Math.min(arr1.length,arr2.length);

       int p1=0;
       int p2=0;
       int k=0;

       while(p1<arr1.length && p2<arr2.length){

            if(arr1[p1]<arr2[p2]){
                arr3[k++]=arr1[p1++];
            }else{
                arr3[k++]=arr2[p2++];
            }
       }

       if(p1==arr1.length){
          for(int i=k;i<arr3.length;i++){
            arr3[k]=arr2[p2++];
          }
       }else{
        for(int i=k;i<arr3.length;i++){
            arr3[k]=arr2[p1++];
          }
       }


       for(int i=0;i<arr3.length;i++){
        System.out.println(arr3[i]);
       }
    }
}
