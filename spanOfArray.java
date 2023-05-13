public class spanOfArray {
    public static void main(String[] args) {
        
        int[] arr={2,5,9,3,1,5,8};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min,arr[i]);
        }

        System.out.println(max-min);
    }
}
