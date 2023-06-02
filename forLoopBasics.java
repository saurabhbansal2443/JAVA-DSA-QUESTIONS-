import java.util.*;

public class forLoopBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int i = 1; i <= 10; i = i + 1) {
        // System.out.println(i);
        // }

        // print even numbers

        // for(int i=1;i<=30;i++){

        // if(i%2==0){
        // System.out.println(i);
        // }
        // }

        // print odd numbers

        // for(int i =1 ;i<=20;i=i+2){
        // System.out.println(i);
        // }

        // factorial of a number
        // int n = 6;
        // int ans =1;
        // for(int i = 1; i<=n;i++){
        // ans = ans *i;
        // }

        // System.out.println(ans);

        // Max of n Numbers
        // int n = sc.nextInt();

        // int max = 0;

        // for (int i = 1; i <= n; i++) {
        // int m = sc.nextInt();

        // if (max < m) {
        // max = m;
        // }

        // }

        // System.out.println(max);

        // sum of n natural numbers

        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i =1 ;i<=n;i++){
        // sum = sum + i;
        // }

        // System.out.println(sum);

        // sum of n odd numbers

        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i =1 ;i<=n;i++){

        // if( i%2!=0){
        // sum = sum + i;
        // }
        // }

        // System.out.println(sum);

        // calculating power of a number

        int n = 2;
        int m = 5;

        int ans = 1;

        for (int i = 1; i <= m; i++) {
            ans = ans * n;
        }

        System.out.println(ans);

    }
}
