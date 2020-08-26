package Excercises.Recursion;

public class sumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(12345));
    }

    public static int sumDigit(int n) {
        if (n <= 9) {
            return n;
        }
        return n % 10 + sumDigit(n / 10);
    }
}