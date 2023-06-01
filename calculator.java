import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        int m = sc.nextInt();

        if(ch=='+'){
            System.out.println(n+m);
        }else if ( ch == '-'){
            System.out.println(n-m);
        }else if ( ch == '*'){
            System.out.println(n*m);
        }else if (ch=='/'){
            System.out.println(n/m);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
