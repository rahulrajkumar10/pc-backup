package test;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the length of side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the length of side 3:");
        double side3 = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        double area = calculateArea(side1, side2, height);
        double perimeter = calculatePerimeter(side1, side2, side3);
        double volume = calculateVolume(area, height);

        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Volume of the triangle: " + volume);
        scanner.close();
    }

    static double calculateArea(double side1, double side2, double height) {
        return 0.5 * side1 * height;
    }

    static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    static double calculateVolume(double area, double height) {
        return area * height;
    }
}
