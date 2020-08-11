import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = { 88, 56, 1, 2, 20, 7, 5, 3, 4 };

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}