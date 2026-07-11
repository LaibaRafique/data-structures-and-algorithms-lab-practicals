package fibonacciwithmemoization;
import java.util.HashMap;
public class FibonacciWithMemoization {
        
    // Memoization storage
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 5; 
        // Change this to the desired value of N

        int result = fibonacci(n);

        System.out.println("The " + n + 
                "-th term in the Fibonacci series is: " + result);
    }

    private static int fibonacci(int n) {
        // Check if the result for 'n' is already memoized
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Base cases for the Fibonacci series
        if (n <= 1) {
            return n;
        }

        // Recursive calculation with memoization
        int fibResult = fibonacci(n - 1) + fibonacci(n - 2);

        // Memoize the result before returning
        memo.put(n, fibResult);

        return fibResult;
    }
}
