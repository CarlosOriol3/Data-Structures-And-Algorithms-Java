package SortAlgorthims;

import java.util.Arrays;


public class selectionSort {
    public static void main(String[] args) {
        int[] array = { 88, 56, 1, 2, 20, 7, 5, 3, 4 };

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            int temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
            }

            array[i] = array[min];
            array[min] = temp;
        }
    }
}