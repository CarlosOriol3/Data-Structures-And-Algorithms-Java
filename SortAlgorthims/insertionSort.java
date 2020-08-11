package SortAlgorthims;

import java.util.Arrays;

/**
 * insertionSort
 */
public class insertionSort {
    public static void main(String[] args) {
        int[] array = { 88, 56, 1, 2, 20, 7, 5, 3, 4 };

        insertionSort(array);

        System.out.println(Arrays.toString(array));

    }

    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
    }
}
