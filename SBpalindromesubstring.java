public class SBpalindromesubstring {
    public static void main(String[] args) {

        String str = "abcddcba";

        StringBuilder sb = new StringBuilder(str);

        for(int i =0;i<sb.length();i++){

            for(int j=i+1;j<sb.length()+1;j++){
                String sub = sb.substring(i, j);

                boolean flag = checkPalindrome(sub);

                if(flag==true){
                    System.out.println(sub);
                }

            }
        }


        
    }

    public static boolean checkPalindrome(String str){
        int start=0;
        int end = str.length()-1;

        boolean flag = true ;

        while(start<end){

            if(str.charAt(start)!=str.charAt(end)){
                flag=false;
                break;
            }
            start++;
            end--;
        }

        return flag;
    }
}
