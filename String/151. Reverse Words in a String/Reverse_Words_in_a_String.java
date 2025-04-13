
class Solution {

    public String reverseWords(String s) {
        String result = "";
        String temp = "";
        s = s.trim();
        System.out.println();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                temp = s.charAt(i) + temp;
            } else if (s.charAt(i) == ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {

            } else {
                result = result + temp + " ";
                temp = "";
            }
        }
        result = result + temp;
        return result;
    }
}

public class Reverse_Words_in_a_String {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "  Hello World!  ";
        String result = sol.reverseWords(s);
        System.out.println(result); // Output: "World! Hello"
    }
}
