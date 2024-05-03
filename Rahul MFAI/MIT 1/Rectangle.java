package test;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle:");
        double height = scanner.nextDouble();

        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);
        double volume = calculateVolume(length, width, height);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Volume of the rectangle: " + volume);
        scanner.close();
    }

    static double calculateArea(double length, double width) {
        return length * width;
    }

    static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
}
