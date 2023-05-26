import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for(int i=0;i<numbers.size();i++){
            int ele = numbers.get(i);
            System.out.println(ele);
        }


    }
}
