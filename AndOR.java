public class AndOR {
    public static void main(String[] args) {
        // char ch = 'u';

        // if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //     System.out.println("Vowel");
        // }else{
        //     System.out.println("Consonent");
        // }

        int a =15;
        int b=6;
        int c=22;

        if( a==b && b==c){
            System.out.println("Equi");
        }else if ( a==b || b==c || a==c){
            System.out.println("iso");
        }else{
            System.out.println("scalene");
        }
    }
}
