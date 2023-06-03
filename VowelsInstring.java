import java.util.*;
public class VowelsInstring {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();
        int count = 0;

        for(int i=0;i<length;i++){
            char ch = str.charAt(i);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U' ){
                count++;
            }
        }

        System.out.println(count);
    }
}
