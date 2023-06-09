public class compress {
    public static void main(String[] args) {
        String str = "aaaabbbbbcddddeeeefggggg";
        String ans = "";

        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);

            if (curr != pre) {

                ans += pre;
                count++;
                if (count > 1) {
                    ans = ans + count;
                }

                count = 0;

            } else {
                count++;
            }

        }

        ans += str.charAt(str.length() - 1);
        
        count++;
        if (count > 1) {   
            ans += count;
        }

        System.out.println(ans);

    }
}
