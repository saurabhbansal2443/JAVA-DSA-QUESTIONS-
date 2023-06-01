import java.util.*;

public class hiring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press M for married and U for unmarried");

        char status = sc.next().charAt(0);

        System.out.println("Enter Your Age ");

        int age = sc.nextInt();

        System.out.println("Press M for male and F for female ");

        char gender = sc.next().charAt(0);

        if ((status == 'm' || status == 'M') || (age > 30 && (gender == 'm' || gender == 'M'))  || (age > 25 && (gender == 'f' || gender == 'F'))) {
            System.out.println("You Are Hired");
        }  else {
            System.out.println("You are not hired");
        }
    }
}