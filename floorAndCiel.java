public class floorAndCiel {
    public static void main(String[] args) {
        
        int[] arr={12,22,45,65,98,56};


        int ciel=0;
        int floor=0;
        int k=33;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>=k && ciel<arr[i]){
                ciel=arr[i];
            }else if(arr[i]<=k && floor>arr[i]){
                floor=arr[i];
            }

        }

        System.out.println(ciel);
        System.out.println(floor);

    }
}
