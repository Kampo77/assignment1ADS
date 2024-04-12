package tasks;

public class Ninth {
    /**
     * Recursion algorithm.
     * This method takes two different values(n, k) for using them in binomialCoefficient formula
     *
     * @param n integer n from binomialCoefficient formula
     * @param k integer k from binomialCoefficient formula
     * @return Result of binomialCoefficient formula
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}
