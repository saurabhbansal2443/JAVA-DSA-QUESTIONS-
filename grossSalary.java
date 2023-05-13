import java.util.*;
public class grossSalary
{
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    
	    int price = sc.nextInt();
        int quantity= sc.nextInt();

        if(quantity>100){

            int pay=(price * quantity * 90 )/100;
            System.out.println(pay);
        }else{
            System.out.println(price*quantity);
        }
	    
	
	}
}
