package test;

public class Factorial {
    public static void main(String[] args) {
        int number = 10; 
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
