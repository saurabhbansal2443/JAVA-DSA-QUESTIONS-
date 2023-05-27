import java.util.*;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 2, 1, 3, 4, 5, 3, 6, 6, 7 };

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

           boolean res = false;

           for(int j=0;j<ans.size();j++){
             if(ans.get(j)==arr[i]){
                res=true;
             }
           }

            if (res == false) {
                ans.add(arr[i]);
            }
        }

        for (int i : ans) {
            System.out.println(i);
        }

    }

    public static boolean checkElement(ArrayList<Integer> list, int k) {

        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == k) {
                flag = true;
            }
        }

        return flag;

    }

}
