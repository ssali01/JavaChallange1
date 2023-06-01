public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num) {

        int sumOfDigits = 0;
        int tempNum = num;
        int numDigits = String.valueOf(num).length(); // convert num to String to be able to get the num of digits in int

        while (tempNum > 0) {

            int lastDigit = tempNum % 10; // this will extract each digit one at a time starting from last digit, so 153%10=3
            sumOfDigits += Math.pow(lastDigit, numDigits); // we raise each digit to the power of numDigits, so 3^3 = 27, so now
            // sumOfDigits += 27, then + 125 , then + 1 making total sum 153
            System.out.println("sumOfDigits = " + sumOfDigits);
            tempNum /= 10; // this will make sure to get rid of the remainders, so 153/10 = 15 and 3 is not taken/removed, however it
            // was already taken care of at line 11
        }
        return (sumOfDigits == num);
    }

    public static void main(String[] args) {
        System.out.println("isArmstrongNumber(153) = " + isArmstrongNumber(153));
    }
}

