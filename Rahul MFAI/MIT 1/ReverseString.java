package test;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }

    static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }
}
