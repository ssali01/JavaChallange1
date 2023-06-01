public class SpaceProgram {

    public static void main(String[] args) {

        /*
        Given a String return a version with spaces between all of the letters
        If there is already a space in the String put an underscore
            Ex:
               java  -> j a v a
               space word -> s p a c e _ w o r d
         */
     String s = "hello world hallo";
     String result = "";

     for (int i = 0; i < s.length(); i++){
         char element = s.charAt(i);
         if (element == ' '){
             result += "_ ";
         } else {
             result += element + " ";
         }
     }
        System.out.println(result.trim());
    }
}
