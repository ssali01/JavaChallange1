public class Frequency {

    public static void main(String[] args) {

        /*
        word  -> java
        how many 'a' chars?
         */

        String s = "java";
        int counter = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
