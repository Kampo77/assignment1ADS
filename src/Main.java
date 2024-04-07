import tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        solveFirst();
        solveSecond();
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

}
