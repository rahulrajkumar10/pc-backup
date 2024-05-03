package test;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base number:");
        double base = scanner.nextDouble();
        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();
        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        scanner.close();
    }

    static double calculatePower(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
