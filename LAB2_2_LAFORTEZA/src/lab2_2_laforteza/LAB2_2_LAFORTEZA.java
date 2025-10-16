
package lab2_2_laforteza;


public class LAB2_2_LAFORTEZA {

     // Recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static long fibonacciIterative(int n) {
        if (n <= 1)
            return n;
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        
        int[] inputs = {10, 20, 30, 35, 40};

        System.out.println("========================================================");
        System.out.println("   TABLE 2.2 Fibonacci Execution Time Analysis");
        System.out.println("========================================================");
        System.out.println("Input   | Recursive Time (ms)   | Iterative Time (ms)   | Observation");
        System.out.println("--------|-----------------------|-----------------------|------------");

        for (int n : inputs) {
            long startRec = System.nanoTime();
            long fibRec = fibonacciRecursive(n);
            long endRec = System.nanoTime();
            long recTime = (endRec - startRec) / 1_000_000;

            long startItr = System.nanoTime();
            long fibItr = fibonacciIterative(n);
            long endItr = System.nanoTime();
            long itrTime = (endItr - startItr) / 1_000_000;

            String observation;
            if (recTime > itrTime)
                observation = "Iterative faster"; 
            else if (recTime < itrTime)
                observation = "Recursive faster";
            else
                observation = "Same speed";

            System.out.printf("%d\t| %d\t\t\t| %d\t\t\t| %s\n", n, recTime, itrTime, observation);
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Note: Recursive time increases exponentially with n.");
        System.out.println("Iterative time remains nearly constant (linear growth).");
    }
}