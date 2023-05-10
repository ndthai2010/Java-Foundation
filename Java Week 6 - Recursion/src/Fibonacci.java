package src;

import java.util.Scanner;

public class Fibonacci {

	public static long convertFibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return convertFibonacci(n - 1) + convertFibonacci(n - 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("n = ");
		int n = sc.nextInt();
			System.out.println(convertFibonacci(n));
	}

}
