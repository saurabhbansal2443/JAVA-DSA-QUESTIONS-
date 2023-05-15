public class missingNumberIngivenrange{
    public static void main(String[] args) {
        
        int[] arr={2,3,4,5,6};

        int sum=0;

        for(int i=0;i<arr.length;i++){

            sum+=arr[i];
        }

        int n=arr.length +1;

        int ans = ((n*(n+1))/2) - sum;
        System.out.println(ans);
    }
}