package tasks;
public class Third {
    /**
     * This method get the integer for checking is it prime or not.
     * Time complexity O(sqrt(n)).
     *
     * @param n Integer which checking, is it prime or not
     * @return Is number n is prime
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}