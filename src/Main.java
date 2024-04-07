import tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        solveFirst();
//        solveSecond();
          solveThird();

    }

    private static void solveFirst() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(First.findMin(arr, n));
    }

    private static void solveSecond() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Second.findAvg(n, arr));
    }

    private static void solveThird() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (Third.isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is composite");
        }
    }
}
