public class Palindrome_num {
    public static void main(String[] args) {
        
        int n = 1234321;
        int orig = n; // to save number
        int reverse = 0;
        
        while(n > 0){
            int lastDigit = n % 10; // to read last digit in the number
            reverse = reverse * 10 + lastDigit; // update reverse number 0 + 1 = 1..
            n /= 10; // removes last digit 123432 -> 1 gets removed
        }
        System.out.println(orig + " " + (reverse == orig ? "Palindrome" : "Not Palindrome"));
    }
}
