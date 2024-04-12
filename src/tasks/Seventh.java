package tasks;

import java.util.Scanner;

public class Seventh {
    /**
     * Reverses the order of integers read from the given Scanner recursively up to a specified iteration count.
     * Time complexity is O(n)
     *
     * @param scanner The Scanner object used to read integers.
     * @param iter The number of integers to reverse (recursion depth)
     */
    public static void reverse(Scanner scanner, int iter) {
        if (iter == 0) return;
        int t = scanner.nextInt();
        reverse(scanner, iter - 1);
        System.out.print(t + " ");
    }
}
