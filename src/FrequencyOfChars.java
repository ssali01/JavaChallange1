public class FrequencyOfChars {
     /*
  Frequency of chars:
        Given a String that has multiple of the same characters determine the frequency of
        each character. Output a concatenated String that shows the character and the frequency of it:

        input: aaaaabbbccddd
        output: a5b3c2d3
     */

    public static void main(String[] args) {
        String str = "aaaaabbbccddd";
        String result = "";

        while (!str.isEmpty()) {
            int origLength = str.length(); // original length
            String currentCharacter = str.substring(0, 1); // current character
            str = str.replace(currentCharacter, ""); // remove each character
            result += currentCharacter + (origLength - str.length());
        }
        System.out.println(result);
    }
}
