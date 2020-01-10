package Question;

public class palindromeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              findPalindrome(10);
	}

	private static void findPalindrome(int num) {
		// TODO Auto-generated method stub
		int i=num;
		long rev=0;
		while(num > 0) {
			rev=(rev*10) + (num%10);
			num = num/10;
		}
		if(i == rev) {
			System.out.println("Number is palindrome");
		}
		else 
			System.out.println("Number is not palindrome");
	}

}
