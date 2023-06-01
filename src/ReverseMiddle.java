public class ReverseMiddle {

    /*
    Reverse the middle word, not the whole string
    Ex: I love java

    Output: I evol java
     */
    public static void main(String[] args) {
        String s = "I love java";
        String reverse = "";
        int startIndexOfMiddleWord = s.indexOf(' ') + 1;
        int endIndexOfMiddleWord = s.lastIndexOf(' ');
        String middleWord = s.substring(startIndexOfMiddleWord, endIndexOfMiddleWord);
        System.out.println(middleWord);

        for (int i = middleWord.length() - 1; i >= 0; i--){
           reverse += middleWord.charAt(i);
            System.out.println(reverse);
        }

        System.out.println(s.substring(0, startIndexOfMiddleWord) + reverse + " " + s.substring(endIndexOfMiddleWord));

    }


}
