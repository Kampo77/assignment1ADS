package tasks;

public class Second  {

    /**
     * This method calculates the sum of array.
     * Time complexity of the whole algorithm O(n).
     *
     * @param n Count of elements in array
     * @param arr Array of double numbers
     * @param index Current index of array
     * @return Sum of the array
     */
    public static int findSum(int n, int[] arr,int index){
        if (index >= n) return 0;
        return arr[index] + findSum(n, arr, index + 1);
    }

    /**
     * This method takes the sum of array from previous method.
     * Time complexity of the whole algorithm O(n)
     *
     * @param n Count of elements in array
     * @param arr Array of double numbers
     * @return Average of the array
     */
    public static double findAvg(int n, int[] arr){
        return (double) findSum(n, arr, 0) / n;
    }
}
