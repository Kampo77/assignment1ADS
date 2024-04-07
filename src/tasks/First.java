package tasks;

public class First {
    /**
     * Method find a minimum of array
     * Time complexity of the algorithm is O(n)
     * This algorithm does not use a recursion
     *
     * @param arr Array of numbers
     * @param n Size of array
     * @return Minimum of the array
     */
    public static int findMin(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
