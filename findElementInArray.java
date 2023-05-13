public class findElementInArray{
    public static void main(String[] args) {
        int k=40;
 
        int[] arr={1,45,32,54,40,23,89,100};

        for(int i=0;i<arr.length;i++){

            if(k==arr[i]){
                System.out.println(i);
                return;
            }
        }
    }
}