
public class Fibonacci_asMethod {
    /*
       0 1 1 2 3 5 8 13 21
       input: 8 (index)
       output: 21
        */
    public static int fibonacci(int n) {
        int first = 0; // to represent first index
        int second = 1; // to represent second index

        if (n <= 1){ // this will take care of first two indexes as those always represent fib num
            return n;
        }

        for (int i = 2; i <= n; i++){
            // in order to calc sequence in fib we take the sum of previous nums
            // and that's how the next num is determined:
            int next = first + second; // I repeat every single iteration
            // 0 + 1 = 1 is next
            first = second; // the one that used to be second now becomes first one
            second = next; // second becomes next that was just calculated
        }
        return second;
    }

    public static void main(String[] args) {
        int num = 1;
        System.out.println(fibonacci(num));
    }
}






