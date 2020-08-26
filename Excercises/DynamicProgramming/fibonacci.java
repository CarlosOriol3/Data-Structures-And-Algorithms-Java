package Excercises.DynamicProgramming;

import java.util.HashMap;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(nFibonacci(10, new HashMap<>()));
    }

    public static int nFibonacci(int n, HashMap<Integer, Integer> map) {
        if (n < 2) {
            return n;
        }

        if (map.containsKey(n)) {
            System.out.println(map);
            return map.get(n);
        } else {
            int fib = nFibonacci(n - 1, map) + nFibonacci(n - 2, map);
            map.put(n, fib);
            return fib;
        }
    }
}