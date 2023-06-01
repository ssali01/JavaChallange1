public class Palindrome_String {

    /*
    Given a String determine if it is a Palindrome

    Ex:
        anna
        racecar
        maam
        abcba
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equals(str);
    }

    public static boolean isPal(String s){
        if (s == null){
            return false;
        }
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reverse+=s.charAt(i);
        }
        return reverse.equals(s);

    }

    public static void main(String[] args) {
        String s = "anna";
        System.out.println(isPal(s));
    }


//    public static void main(String[] args) {
//        String s = "anna";
//        String reverse = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reverse += s.charAt(i);
//        }
//        System.out.println(reverse);
//        System.out.println(s.contains(reverse) ? "Palindrome" : "Not a Palindrome");
//    }

}
