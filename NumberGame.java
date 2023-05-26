import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100 + 1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Press S to Start ");

        char ch = sc.next().charAt(0);

        int guess = -1;
        if (ch == 's' || ch == 'S') {

            while (guess != secretNumber) {
                System.out.println("Guess a Number ");
                guess = sc.nextInt();

                if (guess > secretNumber) {
                    System.out.println("Number is greater ");
                } else if (guess < secretNumber) {
                    System.out.println("Number is smaller ");
                } else {
                    System.out.println("You Guess the number right ");
                }
            }
        }

    }
}
