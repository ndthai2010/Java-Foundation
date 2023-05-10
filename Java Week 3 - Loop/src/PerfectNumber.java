package src;

import java.util.Scanner;

public class PerfectNumber {
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("Input n = ");
		int n = sc.nextInt();
		if(isPerfect(n)) {
			System.out.print(n + " la so hoan hao");
			
		}else {
			System.out.print(n + " khong la so hoan hao");
		}
	}

}
