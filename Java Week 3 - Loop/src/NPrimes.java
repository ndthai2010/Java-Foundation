package src;

import java.util.Scanner;

public class NPrimes {
	public static boolean isPrime(int k) {
		int uoc = 0;
		for(int i = 1; i <= k; i++) {
			if(k % i == 0)
				uoc++;
		}
		if(uoc == 2) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void listPrimes(int n) {
		for(int k = 1; k <= n; k++)
			if(isPrime(k) == true)
				System.out.print(k + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("Input n = ");
		int n = sc.nextInt();
		listPrimes(n);
		
		
	}
}
