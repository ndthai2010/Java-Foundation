package src;

import java.util.Scanner;

public class SquareNumber {
	
	public static boolean isSquare(int n) {
		for(int i = 1; i <= n; i++) {
			if(i * i == n)
				return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Input n = ");
		int n = sc.nextInt();
		if(isSquare(n)) {
			System.out.print(n + " la so chinh phuong");
		}else {
			System.out.print(n + " khong la so chinh phuong");
		}
	}
}
