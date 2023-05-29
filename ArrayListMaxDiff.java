import java.util.*;
public class ArrayListMaxDiff {
    public static void main(String[] args) {
        int ans = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        for(int i=0;i<arr.size();i++){

            for(int j=i+1;j<arr.size();j++){
                int dif=Math.abs(arr.get(i)-arr.get(j));
                ans = Math.max(ans , dif);

            }
        }

        System.out.println(ans);
    }
}
