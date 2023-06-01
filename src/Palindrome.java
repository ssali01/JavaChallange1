public class Palindrome {

    /*
    Given a String determine if it is a Palindrome

    Ex:
        anna
        racecar
        maam
        abcba
     */
    public static void main(String[] args) {
        String s = "anna";
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(s.contains(reverse) ? "Palindrome" : "Not a Palindrome");
    }


}
