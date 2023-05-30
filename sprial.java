import java.util.*;
public class sprial {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] arr =new int[3][4];

    for(int i=0;i<3;i++){
        for(int j =0; j<4;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    int rowmin =0;
    int rowmax= arr.length-1;
    int colmin =0;
    int colmax = arr[0].length-1;
    int ele =0;

    while( ele<=(arr.length * arr[0].length)){

        for(int i=rowmin;i<=rowmax;i++){
            System.out.println(arr[i][colmin]);
            ele++;
        }
        for(int i =colmin+1;i<=colmax;i++){
            System.out.println(arr[rowmax][i]);
            ele++;
        }
        for(int i=rowmax-1;i>=rowmin;i--){
            System.out.println(arr[i][colmax]);
            ele++;
        }
        for(int i=colmax-1;i>=colmin;i--){
            System.out.println(arr[rowmin][i]);
            ele++;
        }
        rowmin++;
        rowmax--;
        colmin++;
        colmax--;
    }
}
}

