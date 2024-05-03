package Jpractice;

	import java.util.Arrays;

	public class Slargest {
	    public static int[] findSecondLargestAndSmallest(int[] a) {
	        Arrays.sort(a);
	        int n = a.length;
	        int[] result = new int[2];
	        result[0] = a[n - 2]; 
	        result[1] = a[1];     
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5};
	        int[] result = findSecondLargestAndSmallest(a);
	        System.out.println(Arrays.toString(result));
	    }
	}



