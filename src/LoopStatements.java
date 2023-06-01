public class LoopStatements {

    /*
    skip even numbers
     */

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++){
            if (i % 2 == 0){
                continue; // skips current iteration
            }
            System.out.print(i + " ");
        }

    }
}
