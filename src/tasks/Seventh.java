package tasks;

import java.util.Scanner;

public class Seventh {
    public static void reverse(Scanner scanner, int iter) {
        if (iter == 0) return;
        int t = scanner.nextInt();
        reverse(scanner, iter - 1);
        System.out.print(t + " ");
    }
}
