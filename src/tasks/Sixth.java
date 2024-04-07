package tasks;

public class Sixth {
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
