public class substring {
    public static void main(String[] args) {
        String str = "abccba";

        // for(int i =0;i<str.length();i++){    // for the substring 

        //     for(int j = i+1;j<str.length()+1;j++){
        //         String sub = str.substring(i, j);
        //         System.out.println(sub);
        //     }
        // }

        for(int i =0;i<str.length();i++){     // palindrome substring 

            for(int j = i+1;j<str.length()+1;j++){
                String sub = str.substring(i, j);
                
                boolean flag = checkPalindrome(sub);

                if(flag==true){
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean checkPalindrome(String str){
        boolean flag = true;

        int start=0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                flag = false;

            }
            start++;
            end--;
        }
        return flag;
    }

}
