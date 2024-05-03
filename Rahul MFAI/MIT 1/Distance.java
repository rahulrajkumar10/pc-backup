package test;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter the coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        double distance = calculateDistance(x1, y1, x2, y2);
        
        System.out.println("Distance between the points: " + distance);
        scanner.close();
    }

    static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        
        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        
        return distance;
    }
}
