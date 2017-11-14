package Algorithms.algorithmsOfSort;

public class AlgorithmsOfSortArray {

    public static void bubbleSort (int [] array) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length == 1) return;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0, k = 1; j < i; j++, k++) {
                if (array[j] > array[k]) {
                    int tmp = array[j];
                    array[j] = array[k];
                    array[k] = tmp;
                }
            }
        }
    }
}
