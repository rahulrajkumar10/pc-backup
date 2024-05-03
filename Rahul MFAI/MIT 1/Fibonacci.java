package test;
	import java.util.Scanner;

	public class Fibonacci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the limit for Fibonacci series:");
	        int limit = scanner.nextInt();
	        generateFibonacci(limit);
	        scanner.close();
	    }

	    static void generateFibonacci(int limit) {
	        int a = 0, b = 1;
	        System.out.println("Fibonacci series up to " + limit + " terms:");
	        System.out.print(a + " " + b + " ");
	        int c;
	        for (int i = 2; i < limit; i++) {
	            c = a + b;
	            System.out.print(c + " ");
	            a = b;
	            b = c;
	        }
	    }
	}
