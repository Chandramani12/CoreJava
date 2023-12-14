
public class Palindrome {
	
	
	public static void main(String[] args) {
		int num=122;
		boolean isprime=checkPalindrome(num);
		if(isprime) {
			System.out.println(num+" is Paindrome number");
		}
		else {
			System.out.println(num+" is not Paindrome number");
		}
	
		
	}

	private static boolean checkPalindrome(int num) {
		
		int org=num;
		int reverse=0;
		while(org>0) {
			
			int unit=org%10;
			reverse=reverse*10+unit;
			org=org/10;
		}
		//System.out.println(reverse);
		return reverse==num;
		
	}
}
