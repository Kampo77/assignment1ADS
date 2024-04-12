package tasks;

public class Fifth {
    /**
     * Recursion algorithm.
     * This method works by n integer for finding n-th elements in Fibonacci sequence using recursion.
     * Time complexity is O(n).
     *
     * @param n Index of the Fibonacci number
     * @return N'th number of Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
