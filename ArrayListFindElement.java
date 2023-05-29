import java.util.*;
public class ArrayListFindElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        int k=9;
        int ans = -1;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==k){
                ans =i;
                break;
            }
        }

        System.out.println(ans);

    }
}
