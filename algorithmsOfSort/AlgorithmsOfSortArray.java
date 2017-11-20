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

    public static int [] quickSort (int [] array) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length <= 1) return array;
        int pivotIndex = array.length/2;
        int pivot = array[pivotIndex];
        int [] newArray = new int[array.length];
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (pivotIndex != i) {
                if (array[i] < pivot) {
                    newArray[firstIndex++] = array[i];
                }
                if (array[i] >= pivot) {
                    newArray[lastIndex--] = array[i];
                }
            }
        }
        newArray[firstIndex] = pivot;
        pivotIndex = firstIndex;
        int [] leftArray = new int[pivotIndex];
        int [] rightArray = new int[(array.length - 1) - pivotIndex];
        System.arraycopy(newArray, 0, leftArray, 0, pivotIndex);
        System.arraycopy(newArray, pivotIndex + 1, rightArray, 0, rightArray.length);
        leftArray = quickSort(leftArray);
        rightArray = quickSort(rightArray);
        int [] result = new int[leftArray.length + rightArray.length + 1];
        System.arraycopy(leftArray, 0, result, 0, leftArray.length);
        result[pivotIndex] = pivot;
        System.arraycopy(rightArray, 0, result, pivotIndex + 1, rightArray.length);
        return result;
    }
}
