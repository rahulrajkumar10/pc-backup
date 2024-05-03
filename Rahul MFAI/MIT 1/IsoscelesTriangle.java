package test;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the equal side of the isosceles triangle:");
        double equalSide = scanner.nextDouble();
        System.out.println("Enter the length of the base side of the isosceles triangle:");
        double baseSide = scanner.nextDouble();
        System.out.println("Enter the height of the isosceles triangle:");
        double height = scanner.nextDouble();

        double area = calculateArea(equalSide, baseSide, height);
        double perimeter = calculatePerimeter(equalSide, baseSide);
        double volume = calculateVolume(equalSide, baseSide, height);

        System.out.println("Area of the isosceles triangle: " + area);
        System.out.println("Perimeter of the isosceles triangle: " + perimeter);
        System.out.println("Volume of the isosceles triangle: " + volume);
        scanner.close();
    }

    static double calculateArea(double equalSide, double baseSide, double height) {
        return (baseSide * height) / 2;
    }

    static double calculatePerimeter(double equalSide, double baseSide) {
        return 2 * equalSide + baseSide;
    }

    static double calculateVolume(double equalSide, double baseSide, double height) {
        return calculateArea(equalSide, baseSide, height) * height / 3;
    }
}
