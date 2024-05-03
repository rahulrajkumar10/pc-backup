package test;

import java.util.Scanner;

public class HollowRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the triangle:");
        int rows = scanner.nextInt();
        printHollowRightTriangle(rows);
        scanner.close();
    }

    static void printHollowRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
