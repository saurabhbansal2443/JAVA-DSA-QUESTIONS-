public class AreaPeri {
    public static void main(String[] args) {
        int l = 3;
        int b =4;

        int area = l*b;
        int peri = 2*(l+b);

        if(area>peri){
            System.out.println("area");
        }else{
            System.out.println("perimeter");
        }
    }
}
