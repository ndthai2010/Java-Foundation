package src;
import java.util.Scanner;

public class PalindromeNums {
	
	public static boolean isPalindrome(int k) {
		int temp, rev = 0, original;
		original = k;
		while(k > 0) {
			temp = k % 10;
			rev = rev * 10 + temp;
			k = k / 10;
		}
		
		if(rev == original) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		if (M > N) {
			for(int k = N; k <= M; k++)
				if(isPalindrome(k) == true)
					System.out.print(k + " ");
		}else {
			for(int k = M; k <= N; k++)
				if(isPalindrome(k) == true)
					System.out.print(k + " ");
		}
	}

}
