package test;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the substring : ");
        String input = sc.nextLine();
        sc.close();

        System.out.println("Maximum Repeating Substring: " + findMaxRepeatingSubstring(input));
    }

    private static String findMaxRepeatingSubstring(String input) {
        String maxSubstring = "";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);

                if (input.indexOf(substring, j) != -1 && substring.length() > maxSubstring.length()) {
                    maxSubstring = substring;
                }
            }
        }

        return maxSubstring.isEmpty() ? "No repeating substring found." : maxSubstring;
    }
}
