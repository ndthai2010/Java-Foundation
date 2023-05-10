package src;

import java.lang.Math;
import java.util.Scanner;

public class Exp {

	public static double exp(double x, int n) {
		double sum = 1;
		double firstNum = x;
		for(int i = 2; i <= n; i++) {
			sum += firstNum;
			firstNum = (firstNum * x / i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("x = ");
		double x = sc.nextDouble();
			System.out.print("n = ");
		int n = sc.nextInt();
			System.out.println(Math.round(exp(x, n) * 100.0 )/ 100.0);
	}
}
