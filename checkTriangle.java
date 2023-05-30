public class checkTriangle {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        int c=6;

        if(a==b){

            if(b==c){
                System.out.println("Equi");
            }else{
                System.out.println("Iso");
            }
        }else if ( a==c){
            System.out.println("ISo");
        }else if ( b==c ){
            System.out.println("Iso");
        }else{
            System.out.println("Sca");
        }
    }
}
