public class Capitalize {
    public static void main(String[] args) {
        System.out.println(capitalize("this, is my life. i love to PROGRAm. This is Java."));
    }
    public static String capitalize(String str){
        String[] sentence = str.split("\\. ");
        String fixed = "";
        for (String each : sentence){
            fixed += each.substring(0, 1).toUpperCase() + each.substring(1).toLowerCase();
        }
        return fixed.trim();
    }

    public static String capitalize2(String s){
        String fixed = "";

        while (s.contains(".")){
            String sentence = s.substring(0, s.indexOf(".") + 1);
            fixed += sentence.substring(0, 1).toUpperCase() + sentence.substring(1).toLowerCase();
            s = s.replace(sentence, "");
        }
        return fixed.trim();
    }
}
