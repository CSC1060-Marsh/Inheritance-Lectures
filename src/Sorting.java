import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
 //       bubblesort(new Integer[]{1, 2, 3});
   //     bubblesort(new Double[]{1.0, 2.0, 3.0});
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);

        int[] array = new int[]{1, 5, 4};
        System.out.println(array[0]);
        System.out.println(list.get(0));

        array[0] = 2;
        int oldValue = list.set(0, 2);
        System.out.println(oldValue);
    }

  //  static <T extends Comparable<Integer>> void bubblesort(T[] array) {
   //     for (int i = 0; i < array.length - 1; i++) {
     //       for (int j = 1; j < array.length - i; j++) {
      //          if (array[j-1].compareTo(array[j]) > 0) {
        //            Swap.swap(A, j-1, j);
        //        }
        //    }
      //  }
 //   }
}
