import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        bubblesort(new Integer[]{1, 2, 3});
        bubblesort(new Double[]{1.0, 2.0, 3.0});
        List<Integer> list = new ArrayList<>(i);
        list.add(1);
        list.add(2);
    }

    static <T extends Comparable<Integer>> void bubblesort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j-1].compareTo(array[j]) > 0) {
                    Swap.swap(A, j-1, j);
                }
            }
        }
    }
}
