public class whileloopBasics {
    public static void main(String[] args) {
        // int n = 10 ;

        // int i =1;

        // while( i<=n){
        //     System.out.println(i);
        //     i++;
        // }


        // print even till 30 ;

        // int n =30 ;
        // int i=1;

        // while( i<=n){

        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        //     i++;
        // }

        // print odd till 50 

        // int n =50 ;
        // int i=1;

        // while( i<=n){

        //     if(i%2!=0){
        //         System.out.println(i);
        //     }
        //     i++;
        // }

        // sum of natural numbers 

        // int n = 10 ;

        // int sum =0;

        // while(n>0){
        //     sum = sum + n;
        //     n--;
        // }

        // System.out.println(sum);

        // factorial of a number 

        // int n = 5;

        // int ans =1;

        // while( n>0){

        //     ans = ans * n;
        //     n--;
        // }

        // System.out.println(ans);

        // fibonacci 

        int n = 7 ;

        int ft =0;
        int st =1;

        while ( n>0){
            int tt = ft + st ;

            System.out.println(ft );
            ft = st ;
            st = tt ;
            n--;
        }


















    }
}
