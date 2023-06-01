public class CountSubstringsOfConsecutive0N1s {
    /*
    Given binary string str of 0’s and 1’s only. The task is to count the total number of substrings of string str such that
     each substring has an equal number of consecutive 0’s and 1’s in it.

            Input: str = “010011”
            Output: 4
            Explanation:
     */

    /*
     * In this problem, we are given a binary string consisting of only 0's and 1's.
     * We are required to count the total number of substrings in the given string,
     * where each substring has an equal number of consecutive 0's and 1's in it.
     *  For ex: in the input binary string "010011":
     *  The correct substrings with an equal number of consecutive 0's and 1's are:
     * "01" at index 0 and 1
     * "10" at index 1 and 2
     * "0110" at index 2, 3, 4, and 5
     * "1001" at index 3, 4, 5, and 6
     * Therefore, the count of such substrings is 4.
     */

    /**
     * 1. We start by defining a static method countSubstrings that takes a binary string 'str' as input
     * and returns an int value, representing the count of substrings with an equal number of consecutive 0's and 1's in it.
     */
    public static int countSubstrings(String str) {
        // #1 We declare two integer variables 'n' and 'count', where:
        int n = str.length(); // 'n' -> represents the length of the input string str
        int count = 0; // 'count' -> is used to keep track of the number of valid substrings that we find

        // #2, we use <two nested for loops> to iterate over all possible substrings of the input string:
        for (int i = 0; i < n; i++) { //The outer loop iterates over the starting indices of all possible substrings, from 0 to n - 1
            int count0 = 0;
            int count1 = 0;

            for (int j = i; j < n; j++) {
                if (str.charAt(j) == '0') {
                    count0++;
                } else {
                    count1++;
                }
                if (count0 == count1) {
                    count++;
                    System.out.println("str.substring(i, j) = " + str.substring(i, j+1));
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String str1 = "010011";
        System.out.println("countSubstrings(str1) = " + countSubstrings(str1));

    }
}
