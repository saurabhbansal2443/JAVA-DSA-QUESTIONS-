public class FloorAndCeil {
    public static void main(String[] args) {
        
        int[] arr = {12, 22, 45, 65, 98, 56};

        int floor = Integer.MIN_VALUE;
        int ciel = Integer.MAX_VALUE;
        int k = 22;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                floor = k;
                ciel = k;
                break;
            } else if (arr[i] < k && arr[i] > floor) {
                floor = arr[i];
            } else if (arr[i] > k && arr[i] < ciel) {
                ciel = arr[i];
            }
        }

        System.out.println( floor);
        System.out.println( ciel);
    }
}
