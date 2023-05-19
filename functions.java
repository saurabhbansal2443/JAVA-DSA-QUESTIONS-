public class functions {
    public static void main(String[] args) {
        
          boolean ans = checkPrime(7);
          boolean ans2 = checkPrime(24);
          System.out.println(ans2);

           
            
    }

    public static boolean checkPrime(int a){

            boolean flag = true;

            for(int i=2;i<a;i++){
                if(a%i==0){
                    flag=false;
                }
            }

          return flag;
    }

   

    
}
