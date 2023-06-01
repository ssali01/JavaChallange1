public class CountHi {

    public static void main(String[] args) {
        /*
        count how many 'hi' in given string  String s = "abhicdhelhilofrhiiday";
         */

        String s = "abhicdhelhilofrhiiday";
        int count = 0;

        while (s.contains("hi")) {
            s = s.replaceFirst("hi", "");
            count++;
        }
        System.out.println(count);

        String s1 = "abhicdhelhilofrhiidayhi";
        int count2 = 0;

        for (int i = 0; i < s1.length() - 1; i++){
            if (s1.substring(i, i + 2).contains("hi")){
                count2++;
            }
        }
        System.out.println(count2);
    }
}
