package Jpractice;

	public class palindrome{
	    public static void main(String[] args) {
	        String[] words = {"hello", "level", "world", "radar"};
	        int palindromeCount = 0; 
	        
	        for (String word : words) {
	            if (isPalindrome(word)) {
	            	palindromeCount++;
	                if (palindromeCount == 2) {
	                System.out.println("second palindromic string: " + word);
	                return; 
	            }
	        }
	        }
	        System.out.println("No second palindromic string found");
	    }
	    
	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	        }
	        return true; 
	    }
			return false;
	}


}



