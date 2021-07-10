import java.util.Arrays;

public class SortingArrays {

    /**
     * squareRoot all the element of an array
     * Sort them in descending orders
     * Square all the elements again
     * @param Array Given arrays of positive integers
     */
    public void sortGiveArray(int[] Array) {
        this.squareRoots(Array);
        this.insertionSorting(Array);
        this.squares(Array);
    }

    /**
     * SquareRoot all the elements of an array
     * @param array Given array of positive integers
     * @return array of integers
     */
    public int[] squareRoots(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            array[i] = (int) Math.sqrt(array[i]);

        return array;
    }

    /**
     * Square all the elements of an array
     * @param array Given arrays of positive integers
     * @return array of integers
     */
    public int[] squares(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++)
            array[i] = array[i] * array[i];

        return array;
    }

    /**
     * Sorting an array of integers on descending orders
     * Applying insertion Sorting
     * @param array Array of integers
     * @return array of sorted integers
     */
    public int [] insertionSorting(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int targetCheckIndex = i - 1;

            while (targetCheckIndex >= 0 && array[targetCheckIndex] < temp) {
                array[targetCheckIndex + 1] = array[targetCheckIndex];
                targetCheckIndex--;
            }
            array[targetCheckIndex + 1] = temp;
        }
        return array;
    }
}
