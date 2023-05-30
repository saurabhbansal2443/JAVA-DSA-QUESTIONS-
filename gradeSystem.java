import java.util.*;
public class gradeSystem {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the marks of 5 Subjects");

       int sub1 = sc.nextInt();
       int sub2 = sc.nextInt();
       int sub3 = sc.nextInt();
       int sub4 = sc.nextInt();
       int sub5 = sc.nextInt();

       int sum = sub1 + sub2 + sub3 + sub4 + sub5;

       int p = sum/5;

       if(p>=90){
        System.out.println("A");
       }else if(p>=80){
        System.out.println("B");
       }else if(p>=70){
        System.out.println("C");
       }else if(p>=60){
        System.out.println("D");
       }else if(p>=50){
        System.out.println("E");
       }else{
        System.out.println("F");
       }


    }
}
