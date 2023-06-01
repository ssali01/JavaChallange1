public class CountCharacters {
    public static void main(String[] args) {

        /*
        Given a string find and print how many uppercase letters, lowercase letter, and number are in the string
        Input: 2juMp41EEkd4s4
        Output: 3 uppercase letters
                6 lowercase letters
                5 numbers
         */

        String s = "2juMp41EEkd4s4";
        int upper = 0, lower = 0, nums = 0;

        for (int i = 0; i < s.length(); i++){
            char eachLetter = s.charAt(i);
            if (eachLetter >= 'A' && eachLetter <= 'Z'){
                upper++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z'){
                lower++;
            } else if (eachLetter >= '0' && eachLetter <= '9'){
                nums++;
            }
        }

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(nums);
    }
}
