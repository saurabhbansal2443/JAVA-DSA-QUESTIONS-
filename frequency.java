public class frequency {
    public static void main(String[] args) {
        int[] arr={1,1,2,1,4,5,6,7,1,2,4,31};
        int k=2;

        int ans = findFrequency(arr, k);
        System.out.println(ans);

    }

    public static int  findFrequency(int[] arr , int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }

        return count ;
    }
}
