package Jpractice;

import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        Arrays.sort(a);
        return new int[]{a[n - 2], a[1]};

    }
      public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = getSecondOrderElements(arr.length, arr);
        
        System.out.println("Second largest element: " + result[0]);
        System.out.println("Second smallest element: " + result[1]);
    }
}
