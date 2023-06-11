public class StringBuilderToggleCase {
   public static void main(String[] args) {
        String str = "HeLLo world ";


        StringBuilder sb = new StringBuilder(str);

          
        for(int i =0;i<sb.length();i++){
            char ch = sb.charAt(i);

            if(ch>='a' && ch<='z'){
                ch = (char)(ch-'a' + 'A');
            }else if(ch>='A' && ch<='Z'){
                ch = (char)(ch-'A' + 'a');
            }
            sb.setCharAt(i, ch);
        }

        String ans = sb.toString();

        System.out.println(ans);
   } 
}
