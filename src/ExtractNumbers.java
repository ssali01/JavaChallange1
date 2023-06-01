import java.text.DecimalFormat;

public class ExtractNumbers {
    /*
   Extract values:

        Given a String displaying the price and discount of an item on our app
        determine if the correct information is being displayed

        str = 40% off Deal $59.99 List Price: $99.99

        the format of the input String is d=fixed as seen above
     */
    public static void main(String[] args) {

        String str = "40% off Deal $59.99 List Price: $99.99";

        // 1. extract percentage part
        int percentage = Integer.parseInt(str.substring(0, str.indexOf("%")));
        System.out.println(percentage);

        // 2. extract deal part
        double deal = Double.parseDouble(str.substring(str.indexOf("$") + 1, str.indexOf(" List")));
        System.out.println(deal);

        // 3. extract list part
        double list = Double.parseDouble(str.substring(str.lastIndexOf("$") + 1));
        System.out.println(list);

        double total = list - ((percentage * list)/100);
        System.out.println(total);

        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        total = Double.parseDouble(decimalFormat.format(total));
        System.out.println(total);

        System.out.println(total == deal ? "PASS" : "FAIL");

    }
}
