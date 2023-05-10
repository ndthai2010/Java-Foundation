package src;
import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int k) {
		int temp, rev = 0, original;
		original = k;
		while(k > 0) {
			temp = k % 10;
			rev = rev * 10 + temp;
			k = k / 10;
		}
		
		if (rev == original) {
			return true;
		}else{
			return false;
		}
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = Integer.parseInt(scanner.nextLine());
		System.out.print(isPalindrome(k));
		
	}

}
