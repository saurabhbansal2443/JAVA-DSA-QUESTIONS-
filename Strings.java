import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Q1

        // String str = "Hello";

        // String ans = "";

        // for(int i = str.length()-1;i>=0;i--){
        // ans +=str.charAt(i);
        // }

        // System.out.println(ans);

        // Q2

        // String str = "radar";

        // int start = 0;
        // int end = str.length() - 1;

        // boolean flag = true;

        // while (start < end) {
        // if (str.charAt(start) != str.charAt(end)) {
        // flag = false;
        // break;
        // }
        // start++;
        // end--;
        // }

        // if (flag == true) {
        // System.out.println("Palindrome String");
        // } else {
        // System.out.println("Not Palindrome String ");
        // }

        // Q3

        // String str = " Hello to the World of Java ";
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
        //             || ch == 'O' || ch == 'U') {
        //         count++;
        //     }
        // }

        // System.out.println(count);

        //Q4

        // String str = "Hello to the Worlddd of Java ";

        // String[] arr = str.split(" ");

        // //System.out.println(Arrays.toString(arr));

        // int max =0;

        // for(int i =0;i<arr.length;i++){
        //     int length = arr[i].length();
        //     max = Math.max(max,length);
        // }
        // System.out.println(max);

        //Q5

        // String str = "Hello to the World of Java ";
        // String ans = "";

        // for(int i =0;i<str.length();i++){
        //     char ch = str.charAt(i);

        //     if(ch!=' '){
        //         ans+=ch;
        //     }
        // }

        // System.out.println(ans);

        //Q7
        // String str = "Hello to the world of java ";
        // String ans = "";
        // char fc=str.charAt(0);

        // if(fc>='a' && fc<='z'){
        //     ans +=(char)(fc-'a'+'A');
        // }else{
        //     ans+=fc;
        // }

        // for(int i =1;i<str.length();i++){
        //     char ch =str.charAt(i);
        //     char pre=str.charAt(i-1);

        //     if(pre==' ' && ch>='a' && ch<='z'){
        //         ans+=(char)(ch-'a'+'A');
                
        //     }else{
        //         ans+=ch;
        //     }
        // }
        
        // System.out.println(ans);

            //Q8

        // String str = "Helloo toooo ttthhheeee wwwoooorrld of jjjavaa";

        // String ans = "";

        // for(int i =1 ;i<str.length();i++){
        //     char curr=str.charAt(i);
        //      char pre=str.charAt(i-1);

        //      if( curr!=pre){
        //         ans+=pre;
        //      }
        // }

        // ans+=str.charAt(str.length()-1);
        // System.out.println(ans);

        String str = "Helloo toooooooo ttthhheeee wwwwwwwwwwwwwwoooorrld of jjjavaa";

        int[] arr = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                int idx = ch-'a';
                arr[idx]=arr[idx]+1;
            }else if(ch>='A' && ch<='Z'){
                int idx = ch-'A';
                arr[idx]=arr[idx]+1;
            }
        }




        System.out.println(Arrays.toString(arr));
        int max =0;
        int midx=-1;
        int smax= 0;
        int sMidx=-1;
        for(int i = 0 ;i<arr.length;i++){

            if(max<arr[i]){
                smax=max;
                sMidx=midx;
                max=arr[i];
                midx=i;

            }else if( smax<arr[i]){
                smax=arr[i];
                sMidx=i;
            }
        }

        System.out.println((char)(sMidx+'a'));

        



        




    }
}
