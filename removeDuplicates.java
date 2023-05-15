import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,3,2,1,3,4,2,1,3,4};
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            boolean flag=check(res, arr[i]);

            if(flag==false){
                    res.add(arr[i]);
            }

        }

        for(int i : res){
            System.out.println(i);
        }
    }

    public static boolean check(ArrayList<Integer> res,int k){


        for(int i=0;i<res.size();i++){
            if(res.get(i)==k){
                return true;
            }
        }

        return false;
    }
}
