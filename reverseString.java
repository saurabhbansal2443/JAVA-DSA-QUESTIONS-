public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World ";
        String ans = "";

        for(int i = str.length()-1 ;i>=0;i--){
            char ch = str.charAt(i);

            ans = ans + ch ;
        }

        System.out.println(ans);
    }
}
