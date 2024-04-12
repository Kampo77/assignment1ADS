package tasks;

public class Fourth {
    /**
     * Recursion algorithm.
     * Algorithm complexity is O(n)
     * This method takes n integer and factorize it.
     *
     * @param n Integer and number which this program factorize
     * @return Factorized number
     */
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
