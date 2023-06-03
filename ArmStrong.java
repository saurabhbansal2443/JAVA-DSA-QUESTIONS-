public class ArmStrong {
    public static void main(String[] args) {
        int n = 163;
        int sum = 0;

        int og = n;
        while( n>0){
           int d = n%10;
            sum = sum + d*d*d;
            n=n/10;
        }

        if( sum == og){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
