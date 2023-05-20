import java.util.*;

public class Basicarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr1 = new int[5]; // Declaration

        // int[] arr2 = { 1, 2, 3, 4, 5, 6, 6, 7 }; // intialization

        // arr1[0] = 7;
        // arr1[1] = 8;

        // System.out.println(arr1[0]); //7
        // System.out.println(arr1[1]); //8

        // int length1 = arr1.length; // taking length of array
        // int length2 = arr2.length;

        // System.out.println(length1);
        // System.out.println(arr1[i]); //prinitng a array ;

        // }

        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = -1; // traverse and change a array ;
        // }

        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.println(arr1[i]); // prinitng a array ;
        // }

        // input of an array

        // System.out.println("Enter Size of the array ");

        // int Size = sc.nextInt();

        // int[] marks = new int[Size];

        // for (int i = 0; i < marks.length; i++) {
        //     marks[i] = sc.nextInt(); // takinginput in array
        // }

        // System.out.println("Input is complete ");

        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        // max of an array

        int[] arr3 = { 23, 67, 34, 45, 89, 100, 32 };

        // int max = 0;

        // for (int i = 0; i < arr3.length; i++) {

        //     if (max < arr3[i]) {
        //         max = arr3[i];
        //     }

        // }

        // System.out.println(max);



        // sorting of an array 



        // Arrays.sort(arr3 );

        // System.out.print(Arrays.toString(arr3));  // it converts array to a string 

        // reverse an array 

        // int[] res=new int[arr3.length];
        //     int itr=0;
        // for(int i=arr3.length-1;i>=0;i--){
        //         res[itr]=arr3[i];
        //         itr++;
        // }

        // System.out.print(Arrays.toString(res));

        // 2nd version of resverse an array 

        int start =0;
        int end =  arr3.length-1;

        while(start<end){
            int e= arr3[start];
            arr3[start]=arr3[end];
            arr3[end]=e;

            start++;
            end--;

        }

        System.out.print(Arrays.toString(arr3));



    }
}
