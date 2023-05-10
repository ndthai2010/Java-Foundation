package src;

import java.util.Scanner;

public class NSquares {
	public static boolean isSquare(int n) {
		for(int i = 1; i <= n; i++) {
			if(i * i == n)
				return true;
		}
		return false;
	}

	public static void listSquares(int k) {
		for(int n = 1; n <= k; n++) {
			if(isSquare(n) == true)
				System.out.print(n + " ");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Input n = ");
		int k = sc.nextInt();
		listSquares(k);
		
	}
}
