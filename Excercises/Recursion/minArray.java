package Excercises.Recursion;

public class minArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 0, 2, 5, 6, 67 };

        System.out.println(minArray(arr, 0));
    }

    public static int minArray(int[] Array, int position) {
        if (position >= Array.length -1) {
            return Array[position];
        }
        int min = minArray(Array, position + 1);
        return Array[position] < min ? Array[position] : min;
    }
}