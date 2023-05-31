import java.util.*;

public class uperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'a') {
            if (ch <= 'z') {
                System.out.println("Lower Case");
            }
        } else if (ch >= 'A') {
            if (ch <= 'Z') {
                System.out.println("Upper Case");
            }
        }
    }
}
