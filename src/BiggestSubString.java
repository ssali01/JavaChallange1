public class BiggestSubString {
    /*
     Biggest substring of matching characters

     Given a string find the biggest substring of chars that match and print it

        Ex: Input:  aaabbbcccccddddee
            Output: ccccc
      */

    public static String biggestSubstring(String input) {

        String currentSubstring = "", maxSubstring = "";

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            // if current char is empty or current char matches the first char of current substring
            if (currentSubstring.isEmpty() || currentChar == currentSubstring.charAt(0)) {

               currentSubstring += currentChar; // a

            } else {

                currentSubstring = "" + currentChar;
            }

            if (currentSubstring.length() > maxSubstring.length()) {
                maxSubstring = currentSubstring;
            }
        }
        return maxSubstring;
    }

    public static void main(String[] args) {
        String s = "aaabbbccdddeeeeeee";
        System.out.println(biggestSubstring(s));
    }
}
