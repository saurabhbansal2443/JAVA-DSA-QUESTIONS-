import java.util.*;

public class BarChart{

public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);

    int[] arr={3,1,0,7,5};
    int max=Integer.MIN_VALUE;
    

    for(int i=0;i<arr.length;i++){

      
        max=Math.max(max,arr[i]);

    }

    for(int i=max;i>0;i--){

        for(int j=0;j<arr.length;j++){

            if(i<=arr[j]){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}