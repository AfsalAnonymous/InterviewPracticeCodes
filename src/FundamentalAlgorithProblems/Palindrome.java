package ArrayPractice;
public class Palindrome {

	
	public static void isPalindrome(int num){
	
		System.out.println("given number is " + num);
		int rem = 0;
		int sum = 0;
		int original;
		
		original=num;
		
		
		while(num>0) {
			rem = num%10; // used to get the remainder
			sum = (sum*10)+rem;
			num = num/10;
		}
		
		
		if (original==sum) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
		
	}
	
	
	public static void  isPalindromeString(String str) {
		System.out.println("Given string is " + str);
	
		
		String rev = "";
		String original = str;
		
		int len = str.length();
		for(int i=len-1;i>=0;i--) {    //for loop logic important 
			rev = rev + str.charAt(i);
		}
		
	if(original.equals(rev)) {
		System.out.println("String is a palindrome");
	}
	else {
		System.out.println("String is not a palindrome");
	}
	}
	
	
	public static void main(String[] args) {
		isPalindrome(151);
		isPalindrome(0);
		isPalindromeString("malayalam");
		isPalindromeString("madam");
		isPalindromeString("ada");
		isPalindromeString("a");
		isPalindromeString("Afsal");
	}

}
