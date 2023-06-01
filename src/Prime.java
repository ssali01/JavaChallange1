public class Prime {

    public static void main(String[] args) {

        int num = 50;

        if (num < 2) {
            System.out.println("This is not a prime number.");
            System.exit(0);
        }

        for (int i = 2; i < num; i++){

            boolean isPrime = true; // this checks if every number is Prime or not, that's the purpose of it, it means every number in the range we start from true


            // inner loop is trying to prove it is not Prime
            for (int j = 2; j < i; j++){ // starting from 2 to check divisibility of the number from 2 to the number itself
                if (i % j == 0){ // if the number we're checking (i) is evenly divisible by (j) values (from 2 to the number) it means it is not a prime
                    isPrime = false;
                    break; // stops the inner loop, not the outer
                }

            } // end of the inner loop

            if (isPrime){ // if the num was prime, then print it
                System.out.print(i + " ");
            }

    } // end of the outer loop



//        }
//        for (int i = 2; i < n; i++){
//            if (n % i == 0){
//                isPrime = false;
//            }
//        }
//        System.out.println(isPrime ? "Prime" : "Not a Prime");
    }
}
