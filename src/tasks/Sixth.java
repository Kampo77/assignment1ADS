package tasks;

public class Sixth {
    /**
     * Recursion algorithm.
     * This method takes a and n integer and then return n power of a.
     *
     * @param a Integer
     * @param n Power of a integer
     * @return a in power of n
     */
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * power(a, n - 1);
        } else {
            return 1 / (a * power(a, -n - 1));
        }
    }
}
