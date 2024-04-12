
package tasks;

public class Tenth {
    /**
     * Recursion algorithm.
     * This method finds greatest common divisor of 2 integers
     *
     * @param a Integer for using in GCD formula
     * @param b Integer for using in GCD formula №2
     * @return greatest common divisor of (a, b)
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
  56