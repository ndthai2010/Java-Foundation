package src;
import java.util.Scanner;

public class SuperPrimes {
	
	public static boolean checkNum(int n) {
		int uoc = 0;
		if(n % 2 == 0 && n != 2) {
			return false;
		}else {
			
			for(int i = 1; i <= n; i++) {
				if(n % i == 0)
					uoc = uoc + 1;
			}
		}
		
		if(uoc == 2) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void SuperPrime(int n) {
		while(n > 10 && n % 2 != 0) {
			n = n / 10;
		}
		if(checkNum(n)) {
			System.out.print("True");
		}else {
			System.out.print("False");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("Input n = ");
		int n = sc.nextInt();
		SuperPrime(n);
	}

}
