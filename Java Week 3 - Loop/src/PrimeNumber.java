package src;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		int uoc = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				uoc++;
		}
		if(uoc == 2) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("Input n = ");
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.print(n + " la so nguyen to");
			
		}else {
			System.out.print(n + " khong la so nguyen to");
		}
	}

}
