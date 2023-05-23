public class missingNumber{
    public static void main(String[] args) {
        int[] arr1={2,3,4};      // 1
        int[] arr2={1,4,3,2};    // 5
        int[] arr3={1,5,2,4};    //3 

        int ans = findMissing(arr3);
        System.out.println(ans);
    }

    public static int findMissing(int[] arr){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        int l=arr.length +1;
        int ogsum= (l*(l+1))/2;
        return ogsum-sum;
    }
}