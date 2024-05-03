package test;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
        scanner.close();
    }

    static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; 
            number /= 10; 
        }
        return sum;
    }
}
