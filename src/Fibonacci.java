public class Fibonacci {
    public static void main(String[] args) {
         /*
         0 1 1 2 3 5 8 13 21
         input: 8 (index)
         output: 21
          */
        int n = 9;
        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++){
            int next = first + second;
            first = second;
            second = next;
        }
        if (n == 0){
            System.out.println(first);
        }else {
            System.out.println(second);
        }

    }
}
