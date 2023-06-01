public class FrequencyOfCharacters {
    /*
       given a String determine how many times a character is in the String

       java
       j - 1
       a - 2
       v - 1

       j
         j == j
         j == a
         j == v
         j == a

       a
         a == j
         a == a
         a == v
         a == a

        */
    public static void frequencyOfCharacters (String str){

        String checked = "";

        for (int i = 0; i < str.length(); i++){// this will iterate j, a, v, a

            int count = 0; // every time we check the char we need to reset to 0 for new char from outer loop

            if(!checked.contains("" + str.charAt(i))){ // only run the counting and inner loop if the char has not been already checked
                for (int j = 0; j < str.length(); j++){ // this will compare (i = 'j') with all 4 chars: j, a, v, a
                    if (str.charAt(i) == str.charAt(j)){ // compare the current char from outer loop (i) with each char in the String ('j', 'a', 'v', 'a')
                        count++;// if my current char is equal to char found in the inner loop, count
                    }
                }
                System.out.println(str.charAt(i) + " - " + count);
                checked += str.charAt(i);// adds to checked String -> to tell we already checked this character
            }
        }
    }
    public static void main(String[] args) {

        String str = "java";
        frequencyOfCharacters(str);

    }
}
