package Jpractice;

public class FindDuplicate {
	    public static int findDuplicate(int[] nums) {
	        int n = nums.length - 1;
	        int left = 1;
	        int right = n;

	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            int count = 0;

	            
	            for (int num : nums) {
	                if (num <= mid) {
	                    count++;
	                }
	            }

	            
	            if (count > mid) {
	                right = mid;
	            } else {
	               
	                left = mid + 1;
	            }
	        }

	        return left;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 2, 2};
	        System.out.println(findDuplicate(nums));
	    }
	}


