public class MaxOf3 {
    public static void main(String[] args) {
        int a= 16;
        int b=15;
        int c = 7;

        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else if ( b>c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
