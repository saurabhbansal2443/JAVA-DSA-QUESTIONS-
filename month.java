import java.util.*;
public class month {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();

      if(n==1){
        System.out.println("January");
      }else if ( n==2){
        System.out.println("Feb");

      }else if ( n==3 ){
        System.out.println("March");
      }else if ( n==12){
        System.out.println("Dece");
      }else{
        System.out.println("InvalidInput");
      }
    }
}
