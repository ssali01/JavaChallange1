public class MaxPossibleValue {
     /*
    create a program that will print the maximum possible value of the given N by inserting somewhere in
    the integer:

    > bounds of N: -8,000 - 8,000
        Ex:
            Given N = 268, program returns 5268
            Given N = 670, program returns 6750
            Given N = 0, program returns 50
            Given N = -999, program returns -5999

            test values: 268, 670, 678, 839, -999, -490, -400

     */
     public static void main(String[] args) {
         int n = 268;
         int max = 0; // to store max value
         boolean isPositive = n > 0;

         // 1. convert int to a String:
         String digits = String.valueOf(Math.abs(n));

         // 2. run for loop
         for (int i = 0; i < digits.length(); i++){

         // 3. declare char var to hold each digit
            char eachDigit = digits.charAt(i);

         // 4. set condition for positive and negative scenario
            if ((isPositive && eachDigit < '5') || (!isPositive && eachDigit > '5')){
                max = Integer.parseInt(digits.substring(0, i) + 5 + digits.substring(i));
                break;
            }
         }
         // 5. if each digit > 5
         if (max == 0){
             max = Integer.parseInt(digits + 5);
         }

         System.out.println(isPositive ? max : max * -1);
     }
}
