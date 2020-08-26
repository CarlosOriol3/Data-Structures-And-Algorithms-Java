package Excercises.Recursion;

public class reverseInt {
    public static void main(String[] args) {
        System.out.println(revInt(123456789));
    }
    public static int revInt(int n){
        if (n <= 9) {
            return n;
        }
        return Integer.parseInt(n % 10 +""+revInt(n / 10));
    }
    
}