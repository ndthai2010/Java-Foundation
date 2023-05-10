package src;

import java.util.Scanner;

public class NPerfects {
	public static boolean isPerfect(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0)
				sum = sum + i;
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void listPerfects(int k) {
		for(int n = 1; n <= k; n++)
			if(isPerfect(n) == true)
				System.out.print(n + " ");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int k = sc.nextInt();
		listPerfects(k);
	}
}
