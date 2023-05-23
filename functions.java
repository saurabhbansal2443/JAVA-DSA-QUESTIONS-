public class functions {
    public static void main(String[] args) {

        // boolean ans = checkPrime(7);
        // boolean ans2 = checkPrime(24);
        // System.out.println(ans2);


        // int[] marks ={1,2,67,3,4,78,6,6,7};

        // int maxMarks=maxInArray(marks);

        // System.out.println(maxMarks);

        // fib(7);
        //     boolean ans = checkVowel('a');
        // System.out.println(checkVowel('b'));
        int n=153;
     boolean ans = checkArmstrong(n);
     System.out.println(ans);
     System.out.println(n);

    //System.out.println(reverseString("hello world "));

    }

    public static boolean checkPrime(int a) {

        boolean flag = true;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = false;
            }
        }

        return flag;
    }

    public static int maxInArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;

    }

    public static void fib(int n){
        int ft=0;
        int st=1;

        while(n>0){
            int tt=ft + st;
            System.out.println(ft);

            ft=st;
            st=tt;
            n--;
        }
    }

    public static boolean checkVowel(char ch){
        if( ch=='a' ){
            return true;
        }else{
            return false;
        }
    }


    public static boolean checkArmstrong(int n){
        int sum=0;
        int og=n;
        while(n>0){
            int d= n%10;
            sum+=d*d*d;

            n=n/10;
        }

        if(sum==og) {
            return true ;
        }else{
            return false;
        }
    }

    public static String reverseString(String str){
        String ans ="";

        for(int i=str.length()-1;i>=0;i--){
            ans += str.charAt(i);
        }

        return ans ;
    }






}
