package tasks;

public class Second  {
    public static int findSum(int n, int[] arr,int index){
        if (index >= n) return 0;
        return arr[index] + findSum(n, arr, index + 1);
    }
    public static double findAvg(int n, int[] arr){
        return (double) findSum(n, arr, 0) / n;
    }
}
