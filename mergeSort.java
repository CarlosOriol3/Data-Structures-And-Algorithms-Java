import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 20, 45, 2, 1, 65, 78, 100, 89, 12, 5 };

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] array) {
        int len = array.length;

        if (len == 1) {
            return array;
        }

        int[] left = new int[len / 2];
        int[] right;

        if (len % 2 == 0) {
            right = new int[len / 2];
        } else {
            right = new int[len / 2 + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = array[(left.length) + j];
        }

        int[] result = new int[len];

        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);

        return result;

    }

    static int[] merge(int[] left, int[] right) {
        int[] mergeResult = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length && rightPointer < right.length) {
            if (left[leftPointer] <= right[rightPointer]) {
                mergeResult[resultPointer] = left[leftPointer];
                leftPointer++;
            } else {
                mergeResult[resultPointer] = right[rightPointer];
                rightPointer++;
            }
            resultPointer++;
        }

        while (leftPointer < left.length) {
            mergeResult[resultPointer] = left[leftPointer];
            leftPointer++;
            resultPointer++;
        }

        while (rightPointer < right.length) {
            mergeResult[resultPointer] = right[rightPointer];
            rightPointer++;
            resultPointer++;
        }

        return mergeResult;
    }
}