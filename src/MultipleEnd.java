public class MultipleEnd {
    /*
    Given a String and a number return a String that has the ending character
    duplicated and attached by the number amount of the times
        Ex:
            Input: Hello -> 3
            Output: Hello????

        Ex:
            Input: java -> 5
            Output: javaaaaaa
     */

    public static void main(String[] args) {
     String s = "java";
     int end = 5;

     for (int i = 0; i < end; i++){
        s+= s.charAt(s.length() - 1);
     }

        System.out.println(s);


    }
}
