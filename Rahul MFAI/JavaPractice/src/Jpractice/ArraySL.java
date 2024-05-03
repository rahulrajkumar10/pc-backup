package Jpractice;

public class ArraySL {
	   public static void findNum(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            System.out.println("Array is empty");
	            return;
	        }

	        int min = nums[0]; 
	        int max = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] < min) {
	                min = nums[i];
	            }
	            if (nums[i] > max) {
	                max = nums[i];
	            }
	        }

	        System.out.println("Largest element: " + max);
	        System.out.println("Smallest element: " + min);
	    }

	    public static void main(String[] args) {
	        int[] nums = {100, 50, 75, 25, 200};
	        findNum(nums);
		
	}

}
