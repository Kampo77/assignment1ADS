import tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solveFirst();
//        solveSecond();
//        solveThird();
//        solveFourth();
//        solveFifth();
//        solveSixth();
//         solveSeventh();
//        solveEighth();
//         solveNinth();
//        solveTenth();
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

    private static void solveFourth() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = Fourth.factorial(n);
        System.out.println(result);
    }

    private static void solveFifth() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = Fifth.fibonacci(n);
        System.out.println(result);

    }

    private static void solveSixth() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double result = Sixth.power(a, n);
        System.out.println(result);

    }

    private static void solveSeventh() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Seventh.reverse(scanner, n);
    }

    private static void solveEighth() {
        Scanner scanner = new Scanner(System.in);
    }

    private static void solveNinth() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = Ninth.binomialCoefficient(n, k);
        System.out.println(result);
    }
    private static void solveTenth() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = Tenth.gcd(a, b);
        System.out.println(result);
    }
}

