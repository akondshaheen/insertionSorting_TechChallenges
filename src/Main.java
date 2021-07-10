import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {9, 1, 4, 25};

        SortingArrays sortingArrays = new SortingArrays();
        sortingArrays.sortGiveArray(array);
        System.out.println(Arrays.toString(array));
    }


}
