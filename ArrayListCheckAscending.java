import java.util.*;
public class ArrayListCheckAscending {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        boolean flag =true;
        for(int i=1;i<arr.size();i++){

            if(arr.get(i-1)>arr.get(i)){
                flag =false;
                break;
            }
        }

        System.out.println(flag);
    }
}
