package Excercises.Recursion;

public class intToBinary {
    public static void main(String[] args) {
        String x = toBinary(75);
        String y = toBinaryR(75);
        System.out.println(x);
        System.out.println(y);
    }

    public static String toBinary(int n) {
        String s = "";
        int r;
        while (n > 0) {
            r = n % 2;
            s += r;
            n /= 2;
        }
        String result = "";

        // reverse
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }


    //Recursive Version
    public static String toBinaryR(int n) {
        if (n == 0) {
            return "" + 0;
        }
        return "" + (toBinary(n / 2) + n % 2);
    }
}