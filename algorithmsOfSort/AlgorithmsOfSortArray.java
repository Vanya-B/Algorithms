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

    public static void selectionSort (int [] array) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length == 1) return;
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }
    }

    public static void insertionSort (int [] array) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length == 1) return;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }
}
